package markwaslazy;

import java.util.Scanner;

public class IAmBadAtSwitch {

	public static void main(String[] args) {
		
		Scanner here = new Scanner(System.in);
		
		System.out.println("Enter one of the days of the week:");
		
		String x = here.next();
		
		switch (x) {
		case "monday":
		case "tuesday":
		case "wednesday":
		case "thursday":
		case "friday":
		case "saturday":
		case "sunday":
			System.out.println("\nThat was a right input, but it's better to start with uppercase :D");
		break;
		case "Monday":
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
		case "Friday":
		case "Saturday":
		case "Sunday":
			System.out.println("\nYou entered the correct input :)");
			System.out.println("You also did a great job entering it in proper case!");
		break;
		default:
			System.out.println("\nWrong input.");
			System.out.println("Open this link for the punishment: https://www.youtube.com/watch?v=xvFZjo5PgG0");
		}
		
		here.close();
	
	}

}
