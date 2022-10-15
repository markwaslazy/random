package markwaslazy;

import java.util.Scanner;

public class SquareTable {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int sP, eP;
		
		System.out.println("This is a Square Table Program");
		System.out.println("[enter the starting number]:");
		sP = input.nextInt();
		System.out.println("[enter the ending point]:");
		eP = input.nextInt();
		System.out.println("");
		
		for (int x = sP; x <= eP; x++) {
			System.out.println(x + " * " + x + " = " + x*x);
		}
		
		input.close();
		
		
	}

}
