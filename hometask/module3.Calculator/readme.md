1. open cmd from the project catalog
2. dir /s/b/o *.java > source 							// collect all java file pathes in "source" file:
3. javac -d classes -sourcepath src @source 			// compile source files
4. java -cp classes basic.methods.CalculatorRunner 		// run the program
