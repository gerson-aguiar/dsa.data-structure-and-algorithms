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
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY u as parameter.
     */

    public static String aux = "";
    public static int count = 0;
    public static int count_username = 1;
    public static List<String> usernamesSystem(List<String> u) {
    // Write your code here
       // u.stream().sort();
        List<String> new_username = new ArrayList<String>();
        
        for(String str : u){
            if(count == 0){
                //FIRST USERNAME
                aux = str;
                count++;
                new_username.add(str);
            }
            else{
                //if this.username == back.username
                if(str.equals(aux)){
                    new_username.add(str+""+count_username);
                    count_username++;
                }else{
                    new_username.add(str);
                    count_username = 1;
                }
            }            
        }

        new_username.forEach(System.out::println);
        return new_username;
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
        })
            .collect(toList());

        List<String> result = Result.usernamesSystem(u);

        bufferedReader.close();
    }
}





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

    public static String aux = "";
    public static int count = 0;
    public static int count_username = 1;

    public static List<String> usernamesSystem(List<String> u) {

        List<String> new_username_aux = u;// new ArrayList<String>();

        // List<String> new_username_controller = u;// new ArrayList<String>();

        for (int i = 0; i < u.size(); i++) {
            count_username = 1;
            for (int j = i + 1; j < u.size(); j++) {
                if (u.get(i).equals(u.get(j)) /* && !new_username_controller.get(j).equals("X") */) {
                    // new_username.add(u.get(i) + "" + count_username);
                    new_username_aux.set(j, u.get(i) + "" + count_username);
                    //System.out.println("WARING USERNAME IS EXISTS:");
                    //new_username_aux.forEach(System.out::println);
                    //System.out.println("END");
                    // new_username_controller.set(j,"X");
                    count_username++;
                }
            }
        }
        new_username_aux.forEach(System.out::println);
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
