/**
 * generated by Xtext 2.23.0
 */
package org.xtext.tests;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.json.simple.parser.JSONParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.MyCsvStandaloneSetupGenerated;
import org.xtext.generator.Csv;
import org.xtext.generator.MyCsvCompilerBash;
import org.xtext.generator.MyCsvCompilerPython;
import org.xtext.generator.MyCsvInterpreter;
import org.xtext.myCsv.Program;
import org.xtext.tests.MyCsvInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyCsvInjectorProvider.class)
@SuppressWarnings("all")
public class MyCsvBenchmarkTest {
  public void prepareDirectories() {
    try {
      final ArrayList<String> listFiles = new ArrayList<String>();
      listFiles.add("examples-gen");
      listFiles.add("examples-gen/interpreter");
      listFiles.add("examples-gen/python");
      listFiles.add("examples-gen/bash");
      listFiles.add("examples-gen/stdout");
      for (final String s : listFiles) {
        {
          final File f = new File(s);
          if (((!f.exists()) && (!f.isDirectory()))) {
            Files.createDirectory(Paths.get(s));
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void compileTests() {
    final File directoryPath = new File("examples/tests/");
    this.prepareDirectories();
    InputOutput.<String>println("----------TESTS----------");
    final MyCsvCompilerPython pythonCompiler = new MyCsvCompilerPython();
    final MyCsvCompilerBash bashCompiler = new MyCsvCompilerBash();
    final MyCsvInterpreter interpreter = new MyCsvInterpreter();
    String line = null;
    final PrintStream mainOut = System.out;
    final String mainPath = System.getProperty("user.dir");
    final String interpreterPath = new File("examples-gen/interpreter").getAbsolutePath();
    String[] _list = directoryPath.list();
    for (final String testFile : _list) {
      {
        final String basename = testFile.substring(0, testFile.indexOf("."));
        String _substring = basename.substring("test".length(), basename.length());
        final String outputBasename = ("output" + _substring);
        try {
          InputOutput.<String>println((("TESTING " + basename) + "..."));
          final String inputMyCsv = (("examples/tests/" + basename) + ".mycsv");
          final String compiledPyPath = (("examples-gen/python/" + basename) + ".py");
          final String compiledShPath = (("examples-gen/bash/" + basename) + ".sh");
          final String stdoutPyPath = (("examples-gen/stdout/" + basename) + "-Py.stdout.txt");
          final String stdoutShPath = (("examples-gen/stdout/" + basename) + "-Sh.stdout.txt");
          final String stdoutInterpreterPath = (("examples-gen/stdout/" + basename) + "-Interpreter.stdout.txt");
          final String outputPyPath = (("examples-gen/python/" + outputBasename) + ".csv");
          final String outputShPath = (("examples-gen/bash/" + outputBasename) + ".csv");
          final String outputInterpreterPath = (("examples-gen/interpreter/" + outputBasename) + ".csv");
          final String outputJsonPyPath = (("examples-gen/python/" + outputBasename) + ".json");
          final String outputJsonShPath = (("examples-gen/bash/" + outputBasename) + ".json");
          final String outputJsonInterpreterPath = (("examples-gen/interpreter/" + outputBasename) + ".json");
          final Program prog = this.loadMyCSV(URI.createURI(inputMyCsv));
          Assertions.assertNotNull(prog);
          final EList<Resource.Diagnostic> errors = prog.eResource().getErrors();
          boolean _isEmpty = errors.isEmpty();
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Unexpected errors: ");
          String _join = IterableExtensions.join(errors, ", ");
          _builder.append(_join);
          Assertions.assertTrue(_isEmpty, _builder.toString());
          final String compiledPy = pythonCompiler.compile(prog);
          final String compiledSh = bashCompiler.compile(prog);
          Files.writeString(Paths.get(compiledPyPath), compiledPy, StandardCharsets.UTF_8);
          Files.writeString(Paths.get(compiledShPath), compiledSh, StandardCharsets.UTF_8);
          final Runtime rt = Runtime.getRuntime();
          final String cmdExecPy = (("python3 " + basename) + ".py");
          final String cmdExecSh = (("./" + basename) + ".sh");
          final File bashFile = new File(compiledShPath);
          bashFile.setExecutable(true);
          final long tstart_python = System.nanoTime();
          File _file = new File("examples-gen/python");
          final Process prPy = rt.exec(cmdExecPy, null, _file);
          final int pyTerm = prPy.waitFor();
          final long tend_python = System.nanoTime();
          InputStream _inputStream = prPy.getInputStream();
          InputStreamReader _inputStreamReader = new InputStreamReader(_inputStream);
          final BufferedReader bfrPy = new BufferedReader(_inputStreamReader);
          StringBuilder stdoutPy = new StringBuilder();
          while (((line = bfrPy.readLine()) != null)) {
            stdoutPy.append((line + "\n"));
          }
          Files.writeString(Paths.get(stdoutPyPath), stdoutPy.toString(), StandardCharsets.UTF_8);
          final long tstart_bash = System.nanoTime();
          File _file_1 = new File("examples-gen/bash");
          final Process prSh = rt.exec(cmdExecSh, null, _file_1);
          final int shTerm = prSh.waitFor();
          final long tend_bash = System.nanoTime();
          InputStream _inputStream_1 = prSh.getInputStream();
          InputStreamReader _inputStreamReader_1 = new InputStreamReader(_inputStream_1);
          final BufferedReader bfrSh = new BufferedReader(_inputStreamReader_1);
          StringBuilder stdoutSh = new StringBuilder();
          while (((line = bfrSh.readLine()) != null)) {
            stdoutSh.append((line + "\n"));
          }
          Files.writeString(Paths.get(stdoutShPath), stdoutSh.toString(), StandardCharsets.UTF_8);
          System.setProperty("user.dir", interpreterPath);
          final PrintStream outStream = new PrintStream(stdoutInterpreterPath);
          System.setOut(outStream);
          int interpReturnCode = 0;
          long tstart_interp = 0;
          long tend_interp = 0;
          try {
            tstart_interp = System.nanoTime();
            interpreter.interpretProgram(prog);
            tend_interp = System.nanoTime();
            outStream.flush();
          } catch (final Throwable _t) {
            if (_t instanceof Exception) {
              final Exception e = (Exception)_t;
              interpReturnCode = 1;
              e.printStackTrace();
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          System.setOut(mainOut);
          System.setProperty("user.dir", mainPath);
          InputOutput.<String>println("Execution time:");
          final long pyTime = (tend_python - tstart_python);
          final long shTime = (tend_bash - tstart_bash);
          final long interpTime = (tend_interp - tstart_interp);
          InputOutput.<String>println((((("\tpython: " + Long.valueOf(pyTime)) + " ns (") + Long.valueOf((pyTime / 1000000))) + " ms)"));
          InputOutput.<String>println((((("\tbash: " + Long.valueOf(shTime)) + " ns (") + Long.valueOf((shTime / 1000000))) + " ms)"));
          InputOutput.<String>println((((("\tinterpreter: " + Long.valueOf(interpTime)) + " ns (") + Long.valueOf((interpTime / 1000000))) + " ms)"));
          Assertions.assertEquals(Boolean.valueOf((interpReturnCode == 0)), Boolean.valueOf((pyTerm == 0)));
          Assertions.assertEquals(Boolean.valueOf((interpReturnCode == 0)), Boolean.valueOf((shTerm == 0)));
          final Csv csvInterpreter = new Csv(outputInterpreterPath, ";", false);
          Csv _csv = new Csv(outputPyPath, ";", false);
          Assertions.assertEquals(csvInterpreter, _csv);
          Csv _csv_1 = new Csv(outputShPath, ";", false);
          Assertions.assertEquals(csvInterpreter, _csv_1);
          Assertions.assertTrue(this.compareJson(outputJsonInterpreterPath, outputJsonPyPath));
          Assertions.assertTrue(this.compareJson(outputJsonInterpreterPath, outputJsonShPath));
          InputOutput.<String>println("DONE\n");
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            final Exception e = (Exception)_t;
            System.out.println((((("ERROR: test of " + basename) + " aborted:\n") + e) + "\n"));
            e.printStackTrace();
            Assertions.<String>fail("Exception occured.");
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
      }
    }
  }
  
  public boolean compareCsv(final String outPath1, final String outPath2) {
    if (((!new File(outPath1).exists()) && (!new File(outPath2).exists()))) {
      return true;
    }
    if (((!new File(outPath1).exists()) || (!new File(outPath2).exists()))) {
      return false;
    }
    Csv _csv = new Csv(outPath1);
    Csv _csv_1 = new Csv(outPath2);
    return _csv.equals(_csv_1);
  }
  
  public boolean compareJson(final String outPath1, final String outPath2) {
    try {
      if (((!new File(outPath1).exists()) && (!new File(outPath2).exists()))) {
        return true;
      }
      if (((!new File(outPath1).exists()) || (!new File(outPath2).exists()))) {
        return false;
      }
      final JSONParser jParser = new JSONParser();
      FileReader _fileReader = new FileReader(outPath1);
      final Object json1 = jParser.parse(_fileReader);
      FileReader _fileReader_1 = new FileReader(outPath2);
      final Object json2 = jParser.parse(_fileReader_1);
      return json1.equals(json2);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Program loadMyCSV(final URI uri) {
    Program _xblockexpression = null;
    {
      new MyCsvStandaloneSetupGenerated().createInjectorAndDoEMFRegistration();
      Resource res = new ResourceSetImpl().getResource(uri, true);
      EObject _get = res.getContents().get(0);
      _xblockexpression = ((Program) _get);
    }
    return _xblockexpression;
  }
}
