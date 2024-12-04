/* 2. Given an integer A, count and return the number of trailing zeroes.
a. Example 1
	i. Input: 18
	ii. Output: 1
	iii. Explanation: 18 in binary is represented as 10010, there is 1 trailing zero
b. Example 2
	i. Input: 8
	ii. Output: 3
	iii. Explanation: 8 in binary is represented as 1000, there are 3 trailing zeroes */

//Time Complexity: O(log(n))
//Space Complexity: O(1)

import java.util.Scanner;

public class Main {
    public static int trailingZeros(int n) {
        int c = 0;
        do {
            if (n % 2 != 0) {
                break;
            } else {
                c++;
                n = n / 2;
            }
        } while (n != 0);
        return c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(trailingZeros(n));
        scanner.close();
    }
}
