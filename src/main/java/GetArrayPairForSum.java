import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Question3 {

    public static void main(String[] args) {
        Question3 q3 = new Question3();
        int[] testPairMap = {4,2,3,1,1};
        Map<Integer, Integer> pairMap = q3.getArrayPairForSum(testPairMap, 2); //do something with pair map
    }

    private Map<Integer, Integer> getArrayPairForSum (int[] arrayInput, int sum) {
        Map<Integer, Integer> pairMap = new HashMap<Integer, Integer>();
        List<Integer> complement = new ArrayList<Integer>();
        for (int i = 0; i < arrayInput.length; i++) {
            int temp = sum - arrayInput[i];
            if (complement.contains(arrayInput[i])) { // if found in complement, it's a pair
                System.out.println("Found Pair : " +arrayInput[i]+ " with " +temp);
                pairMap.put(arrayInput[i], temp);
            } else {
                complement.add(temp);
            }
        }
        return pairMap;
    }


}
