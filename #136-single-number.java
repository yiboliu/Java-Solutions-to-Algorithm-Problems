public class Solution {
    public int singleNumber(int[] nums) {
        int max = nums[0];
		int min = max;
        for (int i = 1; i < nums.length; i++) {
        	if(max < nums[i]) max = nums[i];
        	if(min > nums[i]) min = nums[i];
        }
        int [] mask = new int[max + Math.abs(min) + 1];
        for (int j = 0; j < nums.length; j++) {
        	mask[nums[j] + Math.abs(min)] ^= 1;
        }
        int result = 0;
        for (int k = 0; k < mask.length; k++) {
        	if(mask[k] == 1) result = k - Math.abs(min);
        }
        return result;
    }
}
