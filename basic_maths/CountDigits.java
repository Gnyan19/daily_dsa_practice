package basic_maths;

import static java.lang.System.*;
import java.util.Scanner;

public class CountDigits {
	public static int count(int n) {
	    // We should handle negative numbers by taking the absolute value
	    n = Math.abs(n); 
	    
	    // Special case for 0
	    if (n == 0) return 1; 

	    int count = 0;
	    while (n > 0) {
	        n /= 10;
	        count++;
	    }
	    return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		int n = sc.nextInt();
		out.println(count(n));
		sc.close();
	}
}
