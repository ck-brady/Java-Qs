//Student name: Charie Brady

import java.util.Scanner;

public class A1Q1 {
	
	public static int[] talk(String[] array, int n) {
	  int[] result = new int[2];
	  int max = 0;
	  int count = 0; 
	  int length = 0;
	  
	  // Loops through each sentence in the array, then loops through each character of each sentence to count it's length. 
	  // Tracks max length and keeps count of each time max is found. Max and count stored in result array and returned. 
	  
	  for(int i = 0; i < n; i++){
		  length = 0;
		  for(int j = 0; j < array[i].length(); j++){
			length++;
		  }
		  if (length > max){
			  max = length;
			  count = 1;
		  } else if (length == max){
			  count++;
		  }  
	  }
	  result[0] = max;
	  result[1] = count;
	  
	  return result;
	}

	public static void main(String[] args) {
		
		// User enters sentences seperated by commas and the number of sentences entered. 
		// Then, this program calls talk() method which returns the longest sentence length and its frequency. 

		int n_sentences = 0;
		String sentences = "";
		String[] sentences_split;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the number of sentences :");
		n_sentences = scanner.nextInt(); 
		scanner.nextLine();

		System.out.println("Please enter an array of " + n_sentences + " sentences separated by commas :");
		sentences = scanner.nextLine();
		
		sentences_split = sentences.split(",");
		
		int[] result = talk(sentences_split, n_sentences);
		
		// Display the result of talk() method.
		
		System.out.println("The length of the longest sentence is : " + result[0]);
		System.out.println("Sentences of this length are repeated : " + result[1] + " time(s)");

	}

}