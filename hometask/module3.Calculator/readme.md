1. open cmd from the project catalog
2. create 'classes' folder on the level of src folder.
3. dir /s/b/o *.java > source // collect all java file pathes in "source" file:
4. javac -d classes -sourcepath src @source // compile source files
5. java -cp classes basic.methods.CalculatorRunner // run the program
