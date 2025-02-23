import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int sock_pair = 0;
    // 10 20 20 10 10 30 50 10 20

 //   100
//50 49 38 49 78 36 25 96 10 67 78 58 98 8 53 1 4 7 29 6 59 93 74 3 67 47 12 85 84 40 81 85 89 70 33 66 6 9 13 67 75 42 24 73 49 28 25 5 86 53 10 44 45 35 47 11 81 10 47 16 49 79 52 89 100 36 6 57 96 18 23 71 11 99 95 12 78 19 16 64 23 77 7 19 11 5 81 43 14 27 11 63 57 62 3 56 50 9 13 45
    static int sockMerchant(int n, int[] ar) {
       
        List<Integer> i = new ArrayList<>();
        for (int j = 0; j <= 100; j++) {
            i.add(0);
        }

        Arrays.stream(ar).forEach(a -> {
            i.set(a, i.get(a) + 1);
        });

        i.forEach(ii -> {
            if (ii > 1) {
                if (ii % 2 == 0) {
                    sock_pair += ii / 2;
                } else {
                    sock_pair += (--ii) / 2;
                }
            }
        });

        return sock_pair;
    }

    static int sockMerchant_comment(int n, int[] ar) {
        
        //Cria List<> auxiliar que ira conter
        //A quantidade de vez que cada par repete
        // par == index
        List<Integer> i = new ArrayList<>();
        for (int j = 0; j < 100; j++) {
            i.add(0);
        }

        //Percorre os pares informador
        //E incrementa na List<> auxiliar
        //No index == par
        Arrays.stream(ar).forEach(a -> {
            i.set(a, i.get(a) + 1);
        });

        //Percorre a List<> auxiliar somando o pares
        //Onde um par se a regra de não ser Impar
        //E par == quantidade / 2
        i.forEach(ii -> {
            if (ii > 1) {
                if (ii % 2 == 0) {
                    sock_pair += ii / 2;
                } else {
                    sock_pair += (--ii) / 2;
                }
            }
        });

        //i.forEach(ii -> {
        //    if (ii > 0)
        //        System.out.println("ii:" + ii);
        //});
        //System.out.println("sock_pair:" + sock_pair);
        return sock_pair;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        // BufferedWriter bufferedWriter = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        /*
         * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
         * 
         * bufferedWriter.close();
         */
        scanner.close();
    }
}
