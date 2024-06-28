package corejava;

public class IsPalindrome {
	
	public static boolean checkPalindrome(int number) {
		int originalNum = number;
		int reversed = 0;
		while (number !=0) {
			int digit = number % 10;
			reversed = reversed * 10 + digit;
			number /=10;
			
		}
		return originalNum == reversed;
	}

	public static void main(String[] args) {
		int number = 121;
		System.out.println("Palindrome = " +checkPalindrome(number));

	}

}
