import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        Map<Integer, Integer> mapResult = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (mapResult.containsValue(target- nums[i])) {
                result[1] = i;
                result[0] = getKeyByValue(mapResult, target- nums[i]);
                break;
            }
            mapResult.put(i, nums[i]);
        }
        return result;
    }

    public static <T, E> T getKeyByValue(Map<T, E> map, E value) {
        for (Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args){
        TwoSum twoSum = new TwoSum();
        int[] test = new int[]{2,7,11,15};
        twoSum.twoSum(test, 9);
    }
}
