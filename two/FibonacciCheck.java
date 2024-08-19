package homeassignment.two;

public class FibonacciCheck {

	public static void main(String[] args) {
		int n=8;
		int firstN = 0;
		int secondN =1;
		
		for (int i = 1; i <=n; i++) {
			System.out.println(firstN+",");
			int nextN=firstN+secondN;
			
			firstN=secondN;
			secondN=nextN;
		}

	}

}
