public class Solution {
    public boolean containsDuplicate(int[] nums) {
        int largest = 0;
		int smallest = 0;
		for(int j = 0; j < nums.length; j++){
			if(nums[j] > largest) largest = nums[j];
			if(nums[j] < smallest) smallest = nums[j];
		}
		boolean [] positive = new boolean [largest + 1];
		boolean [] negative = new boolean [Math.abs(smallest) + 1];
		for(int i = 0; i < nums.length; i++){
			if(nums[i] >= 0 ){
				if(!positive[nums[i]]) positive[nums[i]] = true;
				else return true;
			}
			else {
				if(!negative[-1 * nums[i]]) negative[-1 * nums[i]] = true;
				else return true;
			}
		}
		return false;
    }
}
