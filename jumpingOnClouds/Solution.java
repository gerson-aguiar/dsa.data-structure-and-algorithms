import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int cont = 0;

    static int jumpingOnClouds(int[] c) {

        for (int i = 0; i < c.length; cont++) {
            if (i + 2 < c.length) {
                if (c[i + 2] == 0) {
                    i += 2;

                } else {
                    i += 1;
                }
            } else {
                i += 1;
            }
        }
        return --cont;
    }

    

    static int jumpingOnClouds_comment(int[] c) {

             

    /
        
        
    i (c[
     
         //cont++;
         i += 
    }      
    }
    e{
        //cont++;
        i += 1;
    }

    //System.out.println("Position:" + i);
                   
    nt --;//
         //Sys .out.println("count:" + co ;
      // 
    return --cont;
     
    

    r
    public static void main(String[] args) throws IOException {
        // BufferedWiter bufferedWrite

    riter(System.getenv("OUTPUT_PATH")));


    scanner.skip("(\r\n|[\n\r\u2028\u20

    int[] c = new int[n];
    

    scanner.skip("(\r\n|[\n\r\

    for (int i = 0; 
             c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        // bufferedWriter.write(String.valueOf(result));
        // bufferedWriter.newLine();

        // bufferedWriter.close();

        scanner.close();
    }
}
