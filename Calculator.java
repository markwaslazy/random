import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		char op;
		int x, y, z;
		double a, b, c;
		
		System.out.println("Please choose an operation:");
		System.out.println("a) Addition, b) Subtraction, c) Multiplication, d) Division");
		
		op = in.next().charAt(0);
		
		
		if (op == 'a' || op == 'A') {
			System.out.println("So, you want to add up numbers?");
			System.out.println("Enter the first addend:");
			x = in.nextInt();
			System.out.println("Enter the second addend:");
			y = in.nextInt();
			z = x+y;
			System.out.println("The sum is " + z + "!");
		} else if (op == 'b' || op == 'B') {
			System.out.println("So, you want to subtract numbers?");
			System.out.println("Enter the minuend:");
			x = in.nextInt();
			System.out.println("Enter the subtrahend:");
			y = in.nextInt();
			z = x-y;
			System.out.println("The difference is " + z + "!");
		} else if (op == 'c' || op == 'C') {
			System.out.println("So you want to multiply numbers?");
			System.out.println("Enter the multiplicand:");
			x = in.nextInt();
			System.out.println("Enter the multiplier:");
			y = in.nextInt();
			z = x*y;
			System.out.println("The product is " + z +"!");
		} else if (op == 'd' || op == 'D') {
			System.out.println("So you want to divide numbers?");
			System.out.println("Enter the dividend:");
			a = in.nextInt();
			System.out.println("Enter the divisor:");
			b = in.nextInt();
			c = a/b;
			System.out.println("The quotient is " + String.format("%.2f", c) + "!");
		} else {
			System.out.println("Invalid input.");
			System.out.println("Please refer to this link: https://www.youtube.com/watch?v=xvFZjo5PgG0");
		}
		
		
		in.close();

	}

}
