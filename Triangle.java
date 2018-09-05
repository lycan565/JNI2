import java.util.Scanner;
import java.util.InputMismatchException;

public class Triangle{
	
    
    static{
          System.loadLibrary("Triangle");
    }

	private native void form(int rows, int shape);
	
	
     public static void main(String[] args) {
		 
		 int row, symbol;
		 
         Scanner scanner = new Scanner(System.in);
         System.out.print("\nEnter number of rows : ");

		 do {

			try {
				row = scanner.nextInt();
				if ( row>= 0) break;

			} catch (InputMismatchException e) {
			} finally {
				scanner.nextLine();
			}

			System.out.print("\nInput must be an integer!\nEnter number of rows : ");
		} while (true);
		 
		
		 Scanner scanner2 = new Scanner(System.in);
         System.out.print("Enter shape (number): ");
		 
		 do {

			try {
				symbol = scanner2.nextInt();
				if ( symbol>=0 && symbol<10) break;

			} catch (InputMismatchException e) {
			} finally {
				scanner2.nextLine();
			}

			System.out.print("\nInput must be an integer from 0 to 9!\nEnter shape (number) : ");
		} while (true);
		 
		 scanner.close();
		 scanner2.close();
		  
		 Triangle tr = new Triangle();
		 tr.form(row, symbol);

	}

}