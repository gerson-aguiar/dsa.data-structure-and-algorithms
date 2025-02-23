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

    public static int cont = 0;
    public static int d = 5;    
    public static void main(String args[]) {

        List<Integer> a = new ArrayList<Integer>();

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        
        while (d-- != 0) {
            a.add(sc.nextInt());
        }
        a.forEach(aa -> {
            if (aa == q) {
                cont++;
            }
        });
        System.out.println(cont);    
    }
}
