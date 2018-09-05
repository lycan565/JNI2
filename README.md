# JNI2

Simple program to print an equilateral triangle based on input of row and shape of choice (0-9)

CLI command to run jni program(for my pc):

javac Triangle.java
javac -h . Triangle.java
x86_64-w64-mingw32-gcc -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" -shared -o Triangle.dll Triangle.c
java Triangle