1. open cmd.
2. change catalog to your project catalog.
3. create 'classes' folder on the level of src folder.
4. collect all java files pathes in source file:
dir /s/b/o *.java > source
5. compile source files: 
javac -d classes -sourcepath src @source
6. run the program: 
java -cp classes sort.array.SortArray
