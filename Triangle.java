import java.util.Scanner;

public class Triangle{
	
    
    static{
          System.loadLibrary("Triangle");
    }

	private native void form(int n1, int n2);
	
	
     public static void main(String[] args) {
		 
         Scanner scanner = new Scanner(System.in);
         System.out.printf("Enter number of rows: ");
         int row = scanner.nextInt();
		 
		
		 Scanner scanner2 = new Scanner(System.in);
         System.out.printf("Enter shape (number): ");
         int symbol = scanner2.nextInt();
		  
		  
		 Triangle tr = new Triangle();
		 tr.form(row, symbol);

}

//how to run (for me):
//javac Triangle.java
//java -h . Triangle.java
//x86_64-w64-mingw32-gcc -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32" -shared -o Triangle.dll Triangle.c




}