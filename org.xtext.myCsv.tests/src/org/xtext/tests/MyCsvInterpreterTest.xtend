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
import java.io.File
import java.util.Scanner
import org.xtext.generator.MyCsvInterpreter

@ExtendWith(InjectionExtension)
@InjectWith(MyCsvInjectorProvider)
class MyCsvInterpreterTest {
	
	@Test
	def void interpreterTest() {

		val File directoryPath = new File("examples/tests/")
		//val s = new Scanner(System.in);
		
		println("----------TESTS----------")
		println("<Please print enter between each tests>")
			
		for (testFile : directoryPath.list())
		{
			val basename= testFile.substring(0, testFile.indexOf("."))
			val inputTest= "examples/tests/"+basename+".mycsv"
			
			print("\n---------Test de "+basename+"---------\n")
			//s.nextLine()
			
				
			val prog= loadMyCSV(URI.createURI(inputTest))
			Assertions.assertNotNull(prog)
			val errors = prog.eResource.errors
			if(!errors.isEmpty){print("!!!! ERROR PARSER!!!\n")}
			else
			{
			//Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
		
				val interpreter = new MyCsvInterpreter
				interpreter.interpretProgram(prog)
			}
		}
		print("Done")	
			//Ajouter la vérification sur un outputs oracle	
	}
	
	def loadMyCSV(URI uri){
		new MyCsvStandaloneSetupGenerated().createInjectorAndDoEMFRegistration()
		var res= new ResourceSetImpl().getResource(uri, true);
		res.contents.get(0) as Program
	}
}
