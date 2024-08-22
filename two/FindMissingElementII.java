package homeassignment.two;

import java.util.Arrays;


public class FindMissingElementII {

	public static void main(String[] args) {
		//input the array
		int [] numbers = {1, 4, 3, 2, 8, 6, 7};
		Arrays.sort(numbers);
		
		//find the max and Sum number
		int max = numbers[0];
		int totalsum = 0;
		//int missingElement = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max ) {
				max = numbers [i];
				
			}
			// Find Total sum of the array
			totalsum += numbers[i];
					
			
		}
		//Find the missing element
		int missingElement = (max * (max + 1) / 2) - totalsum;
		
		//Print the values
		System.out.println("Maximum no. in this array is "+ max);
		System.out.println("Sum of the array is " +totalsum);
		System.out.println("The missing element in the array is "+missingElement);
		
		
		
	}
		

}
