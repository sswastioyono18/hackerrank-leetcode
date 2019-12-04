import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinus {

    // Complete the plusMinus function below.
    // tries 10
    static void plusMinus(int[] arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        int size = arr.length;
        for (int value : arr) {
            if (value > 0) {
                positive += 1;
            } else if (value < 0) {
                negative += 1;
            } else if (value == 0) {
                zero += 1;
            }
        }

        double pos = (double) positive / size;
        double neg = (double) negative / size;
        double zer = (double) zero / size;
        DecimalFormat decFor = new DecimalFormat("0.000000");
        System.out.println(decFor.format(pos));
        System.out.println(decFor.format(neg));
        System.out.println(decFor.format(zer));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
