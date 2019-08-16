import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static double maior = 0, menor = 0, igual = 0;
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        
        Arrays.stream(arr).forEach(a -> {
            if (a > 0) {
                maior++;
            } else if (a == 0) {
                igual++;
            } else {
                menor++;
            }
        });

        System.out.printf("%.6f\n", maior/arr.length);
        System.out.printf("%.6f\n", menor/arr.length);
        System.out.printf("%.6f\n", igual/arr.length);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
