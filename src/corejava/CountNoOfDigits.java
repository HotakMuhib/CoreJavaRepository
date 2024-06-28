package corejava;

public class CountNoOfDigits {
	
	//Write a program to count the number of digits in a number.

	public static void main(String[] args) {
		int number = 12222;
		if (number ==0) {
			System.out.println("1");
		}
		int count = 0;
		while(number >0) {
			number = number /10;
			count ++;
			
		}
		System.out.println(count);
	}

}
