package basic_maths;

import static java.lang.System.*;
import java.util.Scanner;

public class ReverseNumber {
	public static int reverse(int x) {
		// We should handle negative numbers by taking the absolute value
		int num = Math.abs(x);
	    int lastDigit = 0;
	    int rev = 0;
	    
	    while(num != 0) {
	    	lastDigit = num % 10;
		    // Check for overflow before multiplying by 10
	        if (rev > (Integer.MAX_VALUE - lastDigit) / 10) {
	        	return 0;  
	        }
	        rev = rev * 10 + lastDigit;
	        num /= 10;
	    }
	    // Re-apply the original sign:
	    return (x<0) ? (-rev) : rev;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		int x = sc.nextInt();
		out.println(reverse(x));
		sc.close();
	}
}
