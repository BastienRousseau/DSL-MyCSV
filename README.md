# DSL MyCSV
*Projet M1/M2 SIF - UE DSL*
*Mathieu Poirier et Bastien Rousseau*

## Objectif

DSL de manipulation de CSV fournissant:
- un interpréteur
- un compilateur vers python
- un compilateur vers bash

https://github.com/FAMILIAR-project/HackOurLanguages-SIF/blob/master/slides/project20.pdf

## Importer le projet
- Cloner le repository git
- Importer le projet DSL-MyCSV dans Eclipse via l'option `Import > Projects from Git (with smart import) > Existing local repository`
- Decocher la case DSL-MyCsv

Si nécessaire:
- Creer un nouveau repertoire xtend-gen dans les projet org.xtext.myCsv.ide et org.xtext.myCsv.ui
- Creer un nouveau repertoire src dans le projet org.xtext.myCsv.ui.tests

## Tester le DSL
### Compilateur Python
Executer org.xtext.myCsv.tests/src/org.xtext.tests/MyCsvCompilerPythonTest.xtend dans Eclipse en tant que Test JUnit
Les fichiers de tests sont dans le dossier org.xtext.myCsv.tests/examples/tests
Les scripts python sont générés dans org.xtext.myCsv.tests/examples-gen

### Compilateur Bash
TODO

### Interpreteur
TODO

### Benchmarks
TODO

## How to use MyCsv

### Compile the project
In Eclipse IDE:
- Right clic on `org.xtext.myCsv.tests > Export ... > Java/Runnable Jar`
- Set "Launch Configuration" to `MyCsvMain - org.xtext.myCsv.tests`
- Choose your export destination

### Use it
From the command line:

Compilateur bash: `java -jar $nameJar compile-bash /path/to/input.mycsv /path/to/output.sh`

Compilateur python:  `java -jar $nameJar compile-python /path/to/input.mycsv /path/to/output.py`

Interpreter: `java -jar $nameJar$ interpret /path/to/input.mycsv`
