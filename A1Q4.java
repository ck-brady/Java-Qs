//Student name: Charie Brady

import java.util.Scanner;

public class A1Q4 {

	public static void main(String[] args){
		
		int goals, assists, penalties, matches, years;
		
		// Enter stats. Ask repeatedly until an integer >= 0 is entered. 
		// Did not handle any other input errors since Professor said not required for this assignment.
		
		Scanner scanner = new Scanner(System.in);	
		
		// Enter goals
		while(true){
			System.out.println("Enter the number of the player goals during the season:");
			goals = scanner.nextInt();
			if (goals >= 0){
				break;
			}
		}

		// Enter assists	
		while(true){
			System.out.println("Enter the number of the player assists during the season:");	
			assists = scanner.nextInt();
			if (assists >= 0){
				break;
			}
		}		
		
		// Enter penalties
		while(true){
			System.out.println("Enter the number of penalties during the season:");	
			penalties = scanner.nextInt();
			if (penalties >= 0){
				break;
			}
		}			
		
		// Enter matches played	
		while(true){
			System.out.println("Enter the number of matches played:");	
			matches = scanner.nextInt();
			if (matches >= 0){
				break;
			}
		}			
		
		// Enter years of service		
		while(true){
			System.out.println("Enter the number of years of service:");	
			years = scanner.nextInt();
			if (years >= 0){
				break;
			}
		}			
		
		// Prints out bonus code based on entered stats. 
		
		int bonus = bonusCode(goals, assists, penalties, matches, years);
		System.out.println("The bonus code of this player is: " + bonus);
		
	}

	public static int bonusCode(int g, int a, int p, int m, int y){
		
		int bonus = 0; 
		
		if ( g > 20 || a > 25 || p < 25 ) {
			if ( y >= 5 && m > 55 ) {
				bonus = 3;
			} else if ( y >= 5 && m <= 55 ) {
				bonus = 2;
			} else {
				bonus = 1; 
			}
		}
		
		return bonus;
	}
}