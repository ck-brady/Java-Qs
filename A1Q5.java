//Student name: Charie Brady

import java.util.Scanner;

public class A1Q5{
	public static void main(String[] args){

		int[][] arrayOfArrays;
		String input = "";
		String all_input = ""; 
		String[] input_split1;
		String[] input_split2;
		
		// This program takes user input data separated by ",". Each line of data has an ";" added to it. 
		// To enter integers into an arrayOfArrays, first all lines are deliminated by ";", then by ",".
		// The String type data is then converted into int type and stored in arrays. 
		
		Scanner scanner = new Scanner(System.in);	
		System.out.println("Enter the array of arrays one row per line. Enter an empty line when you are done.\nElements of each row should be separated by commas:");
		while (true) {
			input = scanner.nextLine();
			if ( input == "" ) {
				break;
			}
			all_input = all_input + input + ";";
		}
		
		input_split1 = all_input.split(";");
		arrayOfArrays = new int[input_split1.length][];	
		
		for (int i = 0; i < input_split1.length; i++) { 
			input_split2 = input_split1[i].split(",");
			int[] tmp = new int[input_split2.length];
			
			for(int j = 0; j < input_split2.length; j++){
				tmp[j] = Integer.parseInt(input_split2[j]);
			}
			arrayOfArrays[i] = tmp;	
		}
		
		// Displays the arrays of integers. 
		
		display(arrayOfArrays);
	}	
	
	public static void display(int[][] arrayOfArrays){
		
		System.out.print("The array of arrays is: ");
		
		for ( int i = 0; i < arrayOfArrays.length; i++ ) {
			System.out.print("\nRow " + i + " : ");
			for ( int j = 0; j < arrayOfArrays[i].length; j++ ) {
				System.out.print(arrayOfArrays[i][j] + " ");
			}
		}
	}
}