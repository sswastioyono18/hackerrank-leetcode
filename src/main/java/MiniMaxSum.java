import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            arr1.add(arr[i]);
        }
        Collections.sort(arr1);
        Long min = Long.valueOf(0);
        Long max = Long.valueOf(0);
        for(int i=0;i<arr1.size();i++){
            if(i>=0 && i<arr.length-1){
                min+=arr1.get(i);
            }
            if(i>=1) {
                max += arr1.get(i);
            }
        }

        System.out.print(min + " " + max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
