import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    public static String r = "NO";
    // Complete the findNumber function below.
    static String findNumber(List<Integer> arr, int k) {

        
        arr.forEach(a -> {
            if(a==k) r = "YES";
        });
        return r;


    }

      // Complete the oddNumbers function below.
      static List<Integer> oddNumbers(int l, int r) {

        List<Integer> i = new ArrayList<Integer>();
        while(l <= r){
            if(l%2 == 1){
                i.add(l);
            }
            l++;
        }
        return i;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arrTemp = new ArrayList<>();

        IntStream.range(0, arrCount).forEach(i -> {
            try {
                arrTemp.add(bufferedReader.readLine().replaceAll("\\s+$", ""));
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> arr = arrTemp.stream().map(String::trim).map(Integer::parseInt).collect(toList());

        int k = Integer.parseInt(bufferedReader.readLine().trim());

        String res = findNumber(arr, k);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
