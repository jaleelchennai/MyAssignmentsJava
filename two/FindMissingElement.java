package homeassignment.two;

import java.util.Arrays;

import io.cucumber.java.mk_latn.No;

public class FindMissingElement {

	public static void main(String[] args) {
		//input the array
		int[] nums = { 1, 4, 3, 2, 8, 6, 7};
		
		//sort the array
		Arrays.sort(nums);
		
		//loop through
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i +1) {
				System.out.println("The missing no.is "+(i+1));
				break;
			}
			
		}

	}

}
