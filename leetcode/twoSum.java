import java.util.HashSet;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> set = new HashMap<>();
        for (int x = 0; x < nums.length; x++) {
            int complement = target - nums[x];
            if (set.containsKey(complement)){
                return new int[]{set.get(complement), x};
            }
            set.put(nums[x], x);
        }
        return null;
    }
}
