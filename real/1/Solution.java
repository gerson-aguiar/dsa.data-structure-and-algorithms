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

class Result {

    /*
     * Complete the 'usernamesSystem' function below.
     *
     * The function is expected to return a STRING_ARRAY. The function accepts
     * STRING_ARRAY u as parameter.
     */

    /**
     * VARIAVEIS GLOBAIS
     */
    public static int count_username = 1;

    /**
     * 
     * @param u
     * @return List<String>
     */
    public static List<String> usernamesSystem(List<String> u) {
        /**
         * CRIAR UMA LISTA AUXILIAR
         * E SERA NELA QUE SERA MODIFICADOR
         * OS USERNAME CASO TENHA NECESSIDADE
         */
        List<String> new_username_aux = u;

        /**
         * TRATA A List<String> u COMO SE FOSSE UMA MATRIZ 2D
         * PERCORRENDO E COMPARANDO CADA ELEMENTO COM TODOS OS OUTROS
         */
        for (int i = 0; i < u.size(); i++) {
            /**
             * VARIAVEL QUE CONTROLA A QUANTIDADE DE USERNAME QUE
             * EXISTE PARA AQUELE NICK
             */
            count_username = 1;
            for (int j = i + 1; j < u.size(); j++) {
                if (u.get(i).equals(u.get(j)) ) {
                    new_username_aux.set(j, u.get(i) + "" + count_username);              
                    count_username++;
                }
            }
        }
        //new_username_aux.forEach(System.out::println); //PRINT APENAS PARA TESTE
        return new_username_aux;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int uCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> u = IntStream.range(0, uCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }).collect(toList());

        List<String> result = Result.usernamesSystem(u);

        bufferedReader.close();
    }
}
