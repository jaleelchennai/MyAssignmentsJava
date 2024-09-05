package homeassignment.six;

import java.util.Iterator;

public class StringOddIndexToUppercase {
	
	public static void main(String[] args) {
		//Input the String
		String text = "changeme";
		
		//convert the string as a array
		char[] charArray = text.toCharArray();
		
		//implement for loop
		for (int i = charArray.length - 1; i >= 0; i--) {
			
			//check the odd index no
			if (i % 2!=0) {
				//convert that particular character into uppercase
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
			
		}
		//convert the array to String back
		String finalText = new String(charArray);
		
		//print the finalText
		System.out.println(finalText);
	}
	
	
	
	

}
