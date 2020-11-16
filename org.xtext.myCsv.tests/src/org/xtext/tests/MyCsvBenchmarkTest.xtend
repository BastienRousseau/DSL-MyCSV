/*
 * generated by Xtext 2.23.0
 */
package org.xtext.tests

import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import org.xtext.myCsv.Program
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI
import org.xtext.MyCsvStandaloneSetupGenerated
import org.xtext.generator.MyCsvCompilerPython
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.charset.StandardCharsets
import java.io.File
import java.io.BufferedReader
import java.io.InputStreamReader
import org.xtext.generator.MyCsvCompilerBash
import org.xtext.generator.MyCsvInterpreter
import java.io.PrintStream
import org.xtext.generator.Csv
import org.json.simple.parser.JSONParser
import java.io.FileReader

@ExtendWith(InjectionExtension)
@InjectWith(MyCsvInjectorProvider)
class MyCsvBenchmarkTest {
	
	@Test
	def void compileTests() {
		val File directoryPath = new File("examples/tests/")
		
		println("----------TESTS----------")
		
		val pythonCompiler = new MyCsvCompilerPython
		val bashCompiler = new MyCsvCompilerBash
		val interpreter = new MyCsvInterpreter
		// Buffer
		var String line;
		
		// Runtime settings
		val PrintStream mainOut = System.out
		val String mainPath = System.getProperty("user.dir")
		val String interpreterPath = new File("examples-gen/interpreter").absolutePath
				
		for (testFile : directoryPath.list())
		{
			
			val basename= testFile.substring(0, testFile.indexOf("."))
			val outputBasename = "output"+basename.substring("test".length, basename.length())
			try {
				// PREPARING testfile
				println("TESTING "+ basename +"...")
				
				val inputMyCsv= "examples/tests/"+basename+".mycsv"
				val compiledPyPath= "examples-gen/python/"+basename+".py"
				val compiledShPath= "examples-gen/bash/"+basename+".sh"
				val stdoutPyPath= "examples-gen/stdout/"+basename+"-Py.stdout.txt"
				val stdoutShPath= "examples-gen/stdout/"+basename+"-Sh.stdout.txt"
				val stdoutInterpreterPath= "examples-gen/stdout/"+basename+"-Interpreter.stdout.txt"
				val outputPyPath= "examples-gen/python/"+outputBasename+".csv"
				val outputShPath= "examples-gen/bash/"+outputBasename+".csv"
				val outputInterpreterPath= "examples-gen/interpreter/"+outputBasename+".csv"
				val outputJsonPyPath= "examples-gen/python/"+outputBasename+".json"
				val outputJsonShPath= "examples-gen/bash/"+outputBasename+".json"
				val outputJsonInterpreterPath= "examples-gen/interpreter/"+outputBasename+".json"
				
				// GETTING MYCSV AST
				val prog = loadMyCSV(URI.createURI(inputMyCsv))
				Assertions.assertNotNull(prog)
				val errors = prog.eResource.errors
				Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
				
				// COMPILING AND WRITING RESULTS
				val compiledPy = pythonCompiler.compile(prog)
				val compiledSh = bashCompiler.compile(prog)
				Files.writeString(Paths.get(compiledPyPath), compiledPy, StandardCharsets.UTF_8);
	    		Files.writeString(Paths.get(compiledShPath), compiledSh, StandardCharsets.UTF_8);
				
				// PREPARE EXECUTION
				val Runtime rt = Runtime.getRuntime();
				val String cmdExecPy = "python3 "+basename+".py"
				val String cmdExecSh = "./"+basename+".sh"
				val File bashFile = new File(compiledShPath)
				bashFile.setExecutable(true);
				
				// EXECUTE PYTHON
				val Process prPy = rt.exec(cmdExecPy, null, new File("examples-gen/python"));
				val BufferedReader bfrPy = new BufferedReader(new InputStreamReader(prPy.getInputStream()));
				var stdoutPy = new StringBuilder
				while ((line = bfrPy.readLine()) !== null)
				{
					stdoutPy.append(line + "\n");
				}
				Files.writeString(Paths.get(stdoutPyPath), stdoutPy.toString, StandardCharsets.UTF_8);
				
				// EXECUTE BASH
				val Process prSh = rt.exec(cmdExecSh, null, new File("examples-gen/bash"));
				val BufferedReader bfrSh = new BufferedReader(new InputStreamReader(prSh.getInputStream()));
				var stdoutSh = new StringBuilder
				while ((line = bfrSh.readLine()) !== null)
				{
					stdoutSh.append(line + "\n");
				}
				Files.writeString(Paths.get(stdoutShPath), stdoutSh.toString, StandardCharsets.UTF_8);
				
				// EXECUTE INTERPRETER
				
				// changing context
				System.setProperty("user.dir", interpreterPath)
				val outStream = new PrintStream(stdoutInterpreterPath)
				System.setOut(outStream)
				
				// execution
				var int interpReturnCode = 0
				try {
					interpreter.interpretProgram(prog)
					outStream.flush()
				} catch (Exception e){
					interpReturnCode = 1
					e.printStackTrace
				}
				
				// restoring context
				System.setOut(mainOut)
				System.setProperty("user.dir", mainPath)
				
				// ASSERTIONS
							
				// Executions should fail together
				
				Assertions.assertEquals(interpReturnCode == 0, prPy.waitFor == 0) 
				//Assertions.assertEquals(interpReturnCode == 0, prSh.waitFor == 0)
				
				// Output should be the same
				val csvInterpreter = new Csv(outputInterpreterPath)
				Assertions.assertEquals(csvInterpreter, new Csv(outputPyPath))
				//Assertions.assertEquals(csvInterpreter, new Csv(outputShPath))		
				
				// Compare Json output
				Assertions.assertTrue(compareJson(outputJsonInterpreterPath, outputJsonPyPath))
				//Assertions.assertTrue(compareJson(outputJsonInterpreterPath, outputJsonShPath))
				
				// Remark: stdout comparison is done manually because MyCsv doesn't specify the exact way to print.
				
				// DONE
				println("DONE\n")
			
			} catch (Exception e) {
				System.out.println("ERROR: test of " + basename + " aborted:\n"+e+"\n");
				e.printStackTrace
				Assertions.fail("Exception occured.")
			}
		}
	}
	
	def compareJson(String outPath1, String outPath2) {
		if(!new File(outPath1).exists && !new File(outPath2).exists){
			return true
		}
		if(!new File(outPath1).exists || !new File(outPath2).exists){
			return false
		}
		return new Csv(outPath1).equals(new Csv(outPath2))
	}
	
	def compareCsv(String outPath1, String outPath2) {
		if(!new File(outPath1).exists && !new File(outPath2).exists){
			return true
		}
		if(!new File(outPath1).exists || !new File(outPath2).exists){
			return false
		}
		val JSONParser jParser = new JSONParser
		val json1 = jParser.parse(new FileReader(outPath1));
		val json2 = jParser.parse(new FileReader(outPath2));
				
		return json1.equals(json2)
	}
		
	def loadMyCSV(URI uri){
		new MyCsvStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res= new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as Program
	}
}
