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

public class a2006 {

    public static int cont = 0;

    public static void main(String args[]) {

        List<Integer> a = new ArrayList<Integer>();

        // 1 2 3 2 1
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(1);

        a.forEach(aa -> System.out.println("a_:" + aa));

        a.forEach(aa -> {
            if (aa == 1) {
                cont++;
            }
        });
        System.out.println(cont);
        /*
         * System.out.println("\n"); a.forEach(System.out::println);
         * System.out.println("\n"); a.stream().filter(aa ->
         * a.contains(1)).forEach(System.out::println);
         */
    }
}
