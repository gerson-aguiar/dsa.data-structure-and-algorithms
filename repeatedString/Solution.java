import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long QTDE_A = s.length() - s.replace("a", "").length();
        long cont = 0;
        if (n == s.length()) {
            return QTDE_A;
        } else if (n < s.length()) {
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'a')
                    cont++;
            }
            return cont;
        } else {
            long quociente = (n / (s.length()));
            long QTDE_A_A = QTDE_A * quociente;
            long NN = n - (s.length() * quociente);
            cont = 0;
            for (int i = 0; i < NN; i++) {
                if (s.charAt(i) == 'a')
                    cont++;
            }
            long QTDE_A_FINAL = cont + QTDE_A_A;
            return QTDE_A_FINAL;
        }
    }

    // Complete the repeatedString function below.
    static long repeatedString_commit(String s, long n) {
        // System.out.println("S0:" + s);
        long QTDE_A = s.length() - s.replace("a", "").length();
        // System.out.println("S1:" + s);
        // System.out.println("A:" + QTDE_A);

        long cont = 0;

        if (n == s.length()) {
            return QTDE_A;
        } else if (n < s.length()) {

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'a')
                    cont++;
            }
            return cont;
        } else {
            // CALCULA QUANTAS STRING CABE NA TAMANHO A SER ANALIZADO
            long quociente = (n / (s.length()));
            // System.out.println("QUOCIENTE:" + quociente);
            long QTDE_A_A = QTDE_A * quociente;
            // System.out.println("QTDE_A_A:" + QTDE_A_A);

            // CALCULA QUANTOS A PARA A SUBSTRING RESTANTE
            long NN = n - (s.length() * quociente);
            // System.out.println("NN:" + NN);
            cont = 0;
            for (int i = 0; i < NN; i++) {
                if (s.charAt(i) == 'a')
                    cont++;
            }
            // System.out.println("cont:" + cont);
            long QTDE_A_FINAL = cont + QTDE_A_A;
            // System.out.println("QTDE_A_FINAL:" + QTDE_A_FINAL);
            return QTDE_A_FINAL;
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        scanner.close();
    }
}

// QTDE_A_FINAL:1000000000000
// 1000000000000