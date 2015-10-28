1. open cmd from the project catalog
2. create in project folder "classes" directory
3. collect all java file pathes in "source" file: 
dir /s/b/o *.java > source 
4. compile source files:
javac -d classes -sourcepath src @source
5. run the program:
java -cp classes basic.methods.CalculatorRunner
