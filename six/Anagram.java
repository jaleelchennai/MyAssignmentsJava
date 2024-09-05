package homeassignment.six;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		//input two string one by one
		String string1 = "stops";
		String string2 = "potss";
		//String string2 = "npotss";
		
		//check the lengths are different or not
		boolean areAnagram = true;
		if (string1.length() != string2.length()) {
			areAnagram = false;
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
					
		} else {
			
			//convert both strings to separate char arrays
			char[] charArray1 = string1.toCharArray();
			char[] charArray2 = string2.toCharArray();
			
			//sort the arrays
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			//compare both arrays
			areAnagram = Arrays.equals(charArray1, charArray2);

		}
		
		//print
		if (areAnagram) {
			System.out.println("The given strings are Anagram.");
			
		} else {
			System.out.println("The given strings are not Anagram.");

		}

	}

}
