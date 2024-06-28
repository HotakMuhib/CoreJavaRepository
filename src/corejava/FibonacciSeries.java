package corejava;

import java.util.Scanner;

public class FibonacciSeries {

	public static void printFibonacciSeries(int num) {
        int first = 0; 
        int second = 1;

        if (num >=1) {
        	System.out.println(first + " ");
        }
        if (num >=2) {
        	System.out.println(second + " ");
        }
        int next;
        for (int i=3; i<=num; i++) {
        	next = first + second;
        	System.out.println(next + " ");
        	first = second;
        	second = next;
        }
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		printFibonacciSeries(num);

	}

}
