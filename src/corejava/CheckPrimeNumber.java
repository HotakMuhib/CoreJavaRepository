package corejava;

public class CheckPrimeNumber {
	
	public static void isPrime(int number) {
		
		if (number <=1) {
			System.out.println("not a prime number");
		}
		
		for (int i=2; i<=Math.sqrt(number); i++) {
			if (number % i==0) {
				System.out.println("Not prime number");
			}
			else {
				System.out.println("prime number");
			}
		}
	}
	public static void main(String[] args) {
		int number =5;
		isPrime(number);

	}

}
