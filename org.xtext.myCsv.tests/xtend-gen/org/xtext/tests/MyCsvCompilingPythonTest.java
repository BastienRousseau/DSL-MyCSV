/**
 * generated by Xtext 2.23.0
 */
package org.xtext.tests;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.MyCsvStandaloneSetupGenerated;
import org.xtext.generator.MyCsvCompilerPython;
import org.xtext.myCsv.Program;
import org.xtext.tests.MyCsvInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(MyCsvInjectorProvider.class)
@SuppressWarnings("all")
public class MyCsvCompilingPythonTest {
  @Test
  public void loadModel() {
    final String inputTest = "examples/compileSpec.mycsv";
    final String outputTest = "examples/compileSpec.py";
    final Program prog = this.loadMyCSV(URI.createURI(inputTest));
    Assertions.assertNotNull(prog);
    final EList<Resource.Diagnostic> errors = prog.eResource().getErrors();
    boolean _isEmpty = errors.isEmpty();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Unexpected errors: ");
    String _join = IterableExtensions.join(errors, ", ");
    _builder.append(_join);
    Assertions.assertTrue(_isEmpty, _builder.toString());
    final MyCsvCompilerPython pythonCompiler = new MyCsvCompilerPython();
    final String compiledProg = pythonCompiler.compile(prog);
    try {
      Files.writeString(Paths.get(outputTest), compiledProg, StandardCharsets.UTF_8);
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    InputOutput.<String>print(compiledProg);
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
