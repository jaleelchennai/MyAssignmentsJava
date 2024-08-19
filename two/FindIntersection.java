package homeassignment.two;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		int[] a = {3,2,11,4,6,7};
		int[] b = {1,2,8,4,9,7};
		Arrays.sort(a);
		Arrays.sort(b);
		//iterate a variable for outerloop
		for (int i = 0; i < a.length; i++) {
			
			//iterate b variable for innerloop
			for (int j = 0; j < b.length; j++) {
				//check a=b, then print
				if (a[i]==b[j]) {
					System.out.println(a[i]);
					break;
				}
			}
		}

	}

}
