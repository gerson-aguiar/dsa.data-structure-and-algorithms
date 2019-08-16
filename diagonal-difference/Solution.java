import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import java.lang.Math;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OUTPUT_PATH.txt"));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> aa1 = new ArrayList<>();
        List<Integer> aa2 = new ArrayList<>();
        List<Integer> aa3 = new ArrayList<>();
        aa1.add(11);
        aa1.add(2);
        aa1.add(4);

        aa2.add(4);
        aa2.add(5);
        aa2.add(6);
        
        aa3.add(10);
        aa3.add(8);
        aa3.add(-12);
        
        arr.add(aa1);
        arr.add(aa2);
        arr.add(aa3);
        // arr.add({1 ,2 ,3});

        /*
         * if (false) IntStream.range(0, n).forEach(i -> { try {
         * arr.add(Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
         * "").split(" ")) .map(Integer::parseInt).collect(toList())); } catch
         * (IOException ex) { throw new RuntimeException(ex); } });
         */
        int result = Result.diagonalDifference(arr);

        System.out.println("result:" + result);
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER. The function accepts
     * 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int i = 0, j = 0, sumS = 0, sumP = 0;
        for (List<Integer> linha : arr) {
            for (int coluna : linha) {
                if (i == j) {
                    sumP += coluna;
                    //System.out.println("sumP" + sumP);
                }
                if ((i + j) == (arr.size()-1)) {
                    sumS += coluna;
                    //System.out.println("sumS" + sumS);
                }
                j++;
            }
            j = 0;
            i++;
        }
        return Math.abs((sumP) - (sumS));
    }

    public static int diagonalDifference_com_comentarios(List<List<Integer>> arr) {
        // Write your code here

        // arr.forEach(a -> a.forEach(System.out::println));
        arr.forEach(System.out::println);

        int TAM = arr.size();
        TAM--;
        int i = 0;
        int j = 0;

        int sumS = 0;
        int sumP = 0;

        for (List<Integer> linha : arr) {
            for (int coluna : linha) {
                if (i == j) {
                    sumS += coluna;
                }
                if ((i + j) == TAM) {
                    sumP += coluna;
                }
                j++;
            }
            j = 0;
            i++;
        }

        return Math.abs((sumP) - (sumS));
    }

}
