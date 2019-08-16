import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {

        /*
         * for (int i = 0; i < n; i++) { for (int j = n; j > 0; j--) { if (j <= i) {
         * 
         * System.out.printf("#"); } else { System.out.printf("0"); } }
         * 
         * if ((i + 1) < n) System.out.print("\n"); }
         */
        int cont = 1;
        while (cont <= n) {
            for (int j = n; j >= 1; j--) {
                // System.out.println("j:" + j + " cont:" + cont + " n:" + n);
                if (j > cont) {
                    System.out.printf(" ");
                } else {
                    System.out.printf("#");
                }
            }
            cont++;
            if ((cont) <= n)
                System.out.println("");
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
/*
 * 654321 1 123456 2 123456 3 123456 4 123456 5 123456 6 123456
 */
