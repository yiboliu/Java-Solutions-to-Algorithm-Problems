import java.util.HashMap;
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int [] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                result[0] = hm.get(nums[i]);
                result[1] = i;
                break;
            }
            hm.put(target - nums[i], i);
        }
        return result;
    }
}
