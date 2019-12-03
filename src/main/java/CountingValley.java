import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValley {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int start = 0;
        int valley = 0;
        for(int i=0;i<n;i++) {
            if (s.charAt(i) == 'D') {
                start = start-1;
            } else if(s.charAt(i)=='U') {
                if (start+1 == 0) {
                    valley += 1;
                }
                start += 1;
            }
        }

        return valley;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
