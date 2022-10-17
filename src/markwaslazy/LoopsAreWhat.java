package markwaslazy;

import java.util.Scanner;

public class LoopsAreWhat {
  
  /* I did not really know how 'do while' loops makes sense in comparison
  with the other loop types, but hopefully I've done something that also makes
  some sense. */

	public static void main(String[] args) {
    
		
		Scanner enter = new Scanner(System.in);
		
		int x = 1;
		int loopNum;
		String message;
		char start;
		char wN;
		
		System.out.println("Do you want to loop something (if not, it will be just a plain print program).");
		System.out.print("Enter (y) if Yes, and (n) if No: ");
		
		start = enter.next().charAt(0);
		
		System.out.println("");
		
		if (start == 'y' || start == 'Y') {
			System.out.print("Enter any line of word: ");
			
			message = enter.next();
			
			System.out.println("How many times you want it to loop?");
			System.out.print("[enter a number]: ");
			
			loopNum = enter.nextInt();
			
			System.out.println("");
			
			System.out.println("Include numbers after every word?");
			System.out.print("(y/n): ");
			
			wN = enter.next().charAt(0);
			
			System.out.println("");
			
			if (wN == 'y' || wN == 'Y') {
				do {
					System.out.println(message + " [" + x + "]");
					x++;
				} while (x <= loopNum);
				System.out.println("");
				System.out.println("[Program finished!]");
			} else if (wN == 'n' || wN == 'N') {
				do {
					System.out.println(message);
					x++;
				} while (x <= loopNum);
				System.out.println("");
				System.out.println("[Program finished!]");
			} else {
				System.out.println("You have entered an invalid input.");
			} 
			
		} else if (start == 'n' || start == 'N') {
			System.out.print("Enter some word: ");
			message = enter.next();
			System.out.println("[You entered]: " + message);
			System.out.println("");
			System.out.println("[Program finished!]");
		} else {
			System.out.println("Invalid input!");
		}
    
    enter.close();

		
	}

}
