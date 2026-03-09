package basic_maths;

import static java.lang.System.*;
import java.util.Scanner;

public class Armstrong {
	public static boolean isArmstrong(int n) {
        // Negative numbers aren't Armstrong
        if (n < 0) return false;
        // 0 is an Armstrong number (0^1 = 0)
        if (n == 0) return true;

        int originalNum = n;
        int count = 0;
        int temp = n;

        // Calculate the number of digits 
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Calculate the sum of digits raised to the power
        int res = 0;
        temp = n; // Reset temp to reuse for the calculation
        while (temp != 0) {
            int lastDigit = temp % 10;
            res += (int) Math.pow(lastDigit, count);
            temp /= 10;
        }
        return res == originalNum;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(in);
		int n = sc.nextInt();
		out.println(isArmstrong(n));
		sc.close();
	}
}

