import java.util.*;

public class TestBiValuedMap {
    public static int solution(int[] A) {

        List<Integer> testList = new ArrayList<>();
        int counter = 0;
        int max = 0;
        int temp = 0;
        if (A.length == 2) {
            max = 2;
        } else {
            for (int i = 0; i < A.length - 1; i++) {
                // if content already 2, then need to check, otherwise always add
                if (testList.size() == 2) {
                    if (!testList.contains(A[i])) {
                        // check if only 2, means unique
                        testList.set(1, A[0]);
                        testList.set(0, A[i]);
                        max = Math.max(counter, max);
                        counter = 0;
                    } else {
                        testList.set(1, A[0]);
                        testList.set(0, A[i]);
                        max = Math.max(counter, max);
                        counter = counter + 1;
                    }
                } else {
                    testList.add(A[i]);
                    counter = counter + 1;
                }
            }
        }
        return Math.max(counter, max);
    }

    public static void main(String[] args) {
//        int[] A = {-20000, 4, 7,/**/ 3, 3, -20002};
        int[] A = {4, 2, 5, 4, 2};
        int result = solution(A);
        System.out.println(result);
    }
}
