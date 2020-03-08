import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BlowCandle {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            arr1.add(ar[i]);
        }

        Collections.sort(arr1);
        Map<Integer, Integer> test = new HashMap<>();
        for (Integer integer : arr1) {
            if (test.containsKey(integer)) {
                int temp = test.get(integer);
                test.put(integer, temp + 1);
            } else {
                test.put(integer, 1);
            }
        }
        return test.get(arr1.get(arr1.size()-1));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
