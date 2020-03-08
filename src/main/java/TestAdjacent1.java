import java.util.Arrays;

public class TestAdjacent1 {
    public static int solution(int[] A) {
        int max = 0;
        int maxIndices=0;

        for(int i=0;i<A.length-1;i++){
            max = Math.max(max, maxIndices);
            for (int j = i+1; j < A.length-max; j++) {
                if(isAdjacent(A[i], A[j])){
                    if(!contains(A,Math.abs(A[i]-A[j]))) {
                        maxIndices = Math.abs(i - j);
                    }
                }
            }
        }
        if(max==0)
            return -1;
        else
            return max;
    }

    public static boolean contains(final int[] arr, final int key) {
        return Arrays.binarySearch(arr, key) >= 0;
    }

    public static boolean isAdjacent(int a, int b){
        boolean result = false;
        if(a == b){
            return false;
        }

        if(Math.abs(a-b) == 2){
            result = true;
        }
        return result;
    }


    public static void main(String[] args){
//        int[] A = {-20000, 4, 7,/**/ 3, 3, -20002};
        int[] A = {1, 4, 7, 3, 3, 5};
        int result = solution(A);
        System.out.println(result);
    }
}
