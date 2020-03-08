import java.util.Arrays;

public class TestDemo {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int result = 0;
        if(A[A.length-1] < 0){
            result = 1;
        } else {
            for(int i=1;i<A.length;i++){
                if(A[i] - A[i-1] > 1 && A[i] - A[i-1] < A[i])
                    result= A[i-1] + 1;
            }
        }

        if(result==0){
            result = A[A.length-1]+1;
        }

        return result;
    }

    public static void main(String[] args){
        int[] A = {1, 3, 6, 4, 1, 2};
        int result = solution(A);
        System.out.println(result);
    }
}
