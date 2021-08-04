//Student name: Charie Brady

import java.util.Scanner;

public class A1Q2{
	
	// Counts the number of positive and negative integers in an array, returns net positive count.

	public static int myCalc(int[] intArray, int n){
		int R = 0;
		int pos = 0;
		int neg = 0;
		
		for(int i = 0; i < n; i++){
			if (intArray[i] > 0){
				pos++;
			} else if (intArray[i] < 0){
				neg++;
			}
		}
		
		R = pos - neg;
		
		return R;
	}

	public static void main(String args[])
		{
			String input = "";
			String[] input_split; 
			Scanner scanner = new Scanner(System.in);
			
			// Takes list of integers as input from user and splits/stores them in an array. 
			
			System.out.println("Please enter an array of values separated by commas :");
			input = scanner.nextLine();
			input_split = input.split(",");
			
			int[] ints = new int[input_split.length];
			
			for(int i = 0; i < input_split.length; i++){
				ints[i] = Integer.parseInt(input_split[i]);
			}
			
			// Call myCalc function to retrieve net positive count, and display the result.
			
			int R = myCalc(ints, ints.length);			
			System.out.println("The number of positive elements minus the number of negative elements is: "+R);

		}
}