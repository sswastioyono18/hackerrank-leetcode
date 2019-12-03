import java.util.Scanner;

public class Bribe {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int size = q.length;
        int sum = 0;
        for (int i = 0; i < size - 1; i++) {
            if (q[i] - i > 2) {
                System.out.println("Too chaotic");
                return;

            }

            System.out.println(sum);

        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}