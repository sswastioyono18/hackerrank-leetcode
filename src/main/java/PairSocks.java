import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PairSocks {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++){
            if(hashMap.containsKey(ar[i])) {
                hashMap.put(ar[i], hashMap.get(ar[i]) + 1);
                System.out.println("add " + ar[i] + " " + hashMap.get(ar[i]));
            }
            else
                hashMap.put(ar[i], 1);
        }

        int answer = 0;
        for (Map.Entry<Integer,Integer> me : hashMap.entrySet()) {
            count = me.getValue();
            System.out.println(count);
            if(count%2==1) {
                answer = answer + (Math.round(count-1)/2);
            } else if (count%2==0) {
                answer = answer + (count/2);
            }
        }

        return answer;

    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("/Users/sactio.swastioyono/")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println();
        System.out.println(result);
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();

//        bufferedWriter.close();

        scanner.close();
    }
}
