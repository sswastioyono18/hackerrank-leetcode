import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long count = 0;
        int lengthString = s.length();
        if(lengthString==1 && s.charAt(0)=='a'){
            count =  n;
        } else {
            long splitWord = n % lengthString;

//        System.out.println(newString);
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    count++;
                }
            }
            long multiplier = (n/lengthString);
            count*=multiplier;

            s= s.substring(0, (int)splitWord);

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'a') {
                    count++;
                }
            }

        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
