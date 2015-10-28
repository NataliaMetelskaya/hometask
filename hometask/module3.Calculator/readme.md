1. open cmd from the project catalog
2. collect all java file pathes in "source" file: 
dir /s/b/o *.java > source 
3. compile source files:
javac -d classes -sourcepath src @source
4. run the program:
java -cp classes basic.methods.CalculatorRunner
