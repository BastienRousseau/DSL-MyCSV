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
import java.util.Scanner

@ExtendWith(InjectionExtension)
@InjectWith(MyCsvInjectorProvider)
class MyCsvCompilerPythonTest {
	
	@Test
	def void compileTests() {
		val File directoryPath = new File("examples/tests/")
		val s = new Scanner(System.in);
		
		println("----------TESTS----------")
		println("<Please print enter between each tests>")
		val pythonCompiler = new MyCsvCompilerPython
		var String line;
		
			
		for (testFile : directoryPath.list())
		{
			val basename= testFile.substring(0, testFile.indexOf("."))
			try {
				
				// PREPARING testfile
				println("TESTING "+ basename +"...")
				s.nextLine()
				
				val inputMyCsv= "examples/tests/"+basename+".mycsv"
				val compiledPyPath= "examples-gen/python/"+basename+".py"
				
				// GETTING MYCSV AST
				val prog = loadMyCSV(URI.createURI(inputMyCsv))
				Assertions.assertNotNull(prog)
				val errors = prog.eResource.errors
				Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
				
				// COMPILING AND WRITING RESULTS
				val compiledPy = pythonCompiler.compile(prog)
				Files.writeString(Paths.get(compiledPyPath), compiledPy, StandardCharsets.UTF_8);
	    		
	    		// PREPARE EXECUTION
				val Runtime rt = Runtime.getRuntime();
				val String cmdExecPy = "python3 "+basename+".py"
				
				// EXECUTE PYTHON
				val Process prPy = rt.exec(cmdExecPy, null, new File("examples-gen/python"));
				val BufferedReader bfrPy = new BufferedReader(new InputStreamReader(prPy.getInputStream()));
				while ((line = bfrPy.readLine()) !== null) {
					println("STDOUT: " + line);
				}

				val BufferedReader bfre = new BufferedReader(new InputStreamReader(prPy.getErrorStream()));
				while ((line = bfre.readLine()) !== null) {
					println("STDERR: " + line);
				}
				
	    		// DONE
				println("DONE\n")
	    		
			} catch (Exception e) {
				System.out.println("ERROR: test of " + basename + " aborted:\n"+e+"\n");
				e.printStackTrace
				Assertions.fail("Exception occured.")
			}
		
		}
}
		
	def loadMyCSV(URI uri){
		new MyCsvStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res= new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as Program
	}
}
