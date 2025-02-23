import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int valley = 0;
    public static int nivel = 0;

    static int countingValleys(int n, String s) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'U') {
                nivel++;
            } else {
                if (nivel == 0) {
                    valley++;
                }
                nivel--;
            }
        }
        return valley;
    }

    static int countingValleys_comment(int n, String s) {

        // UDDDUDUU
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'U') {
                nivel++;
                // System.out.println("U:" + nivel);
            } else {

                if (nivel == 0) {
                    valley++;
                    // System.out.println("V:" + valley);
                }
                nivel--;
                // System.out.println("D:" + nivel);
            }
        }
        // System.out.println("valley:" + valley);
        return valley;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}
