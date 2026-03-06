package basic_maths;

import static java.lang.System.*;
import java.util.Scanner;

public class PalindromeNumber {
	public static boolean isPalindrome(int x) {
		// Negative numbers are never palindrome
		if(x < 0) return false;
	    // overflow during reversal
	    long res = 0;
	    // Store the original value because 'x' will be changed
	    int temp = x;
	    while(x != 0) {
	    	int lastDigit = x % 10;
	        res = res * 10 + lastDigit;
	        x /= 10;
	    }
	    // Compare the reversed number with the original
	    return (int)res == temp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		int x = sc.nextInt();
		out.println(isPalindrome(x));
		sc.close();
	}
}

