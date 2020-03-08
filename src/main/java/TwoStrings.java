import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
//        char[] s1asChar = s1.toCharArray();
//        for(char s: s1asChar){
//            if(s2.contains(s+"")){
//                return "YES";
//            }
//        }
//        return "NO";
//
        Hashtable testString1 = new Hashtable();
        char[] s1asChar = s1.toCharArray();
        char[] s2asChar = s2.toCharArray();
        for(char s: s1asChar){
            testString1.put(s,1);
        }

        for(char s: s2asChar){
            if(testString1.containsKey(s)){
                return "YES";
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

//            bufferedWriter.write(result);
//            bufferedWriter.newLine();
        }

//        bufferedWriter.close();

        scanner.close();
    }
}
