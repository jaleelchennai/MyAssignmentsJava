package homeassignment.two;

public class IsPrime {

	public static void main(String[] args) {
		int num = 24; // Change this to any number you want to check

        if (num <= 1) {
            System.out.println("Number " + num + " is Not Prime");
            return;
        }

        boolean isPrime = true; // Assume the number is prime

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false; // If divisible by any number other than 1 and itself
                break; // No need to check further
            }
        }

        if (isPrime) {
            System.out.println("Number " + num + " is Prime");
        } else {
            System.out.println("Number " + num + " is Not Prime");
        }
    }

}
