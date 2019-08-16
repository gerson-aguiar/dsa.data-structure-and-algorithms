import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        Arrays.sort(arr);
        //Arrays.stream(arr).map(Double::doubleValue);

        
        Double u1 = Double.parseDouble(String.valueOf(arr[0]));
        Double u2 = Double.parseDouble(String.valueOf(arr[1]));
        Double u3 = Double.parseDouble(String.valueOf(arr[2]));
        Double u4 = Double.parseDouble(String.valueOf(arr[3]));
        Double u5 = Double.parseDouble(String.valueOf(arr[4]));
        
        Double d =  u1 + u2 + u3 + u4 + u5;

        Double max = d - u1;
        Double min = d - u5;
        System.out.printf("%.0f %n" ,min);
        System.out.printf("%.0f" ,max);
        
        // System.out.println(Arrays.stream(arr).sum() -
        // Arrays.stream(arr).min().getAsInt());

        /*
         * 10.000.000.000 793810624 895642170 685903712 623789054 468592370
         */
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}