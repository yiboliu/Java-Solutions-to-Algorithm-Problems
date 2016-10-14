public class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 0) return;
        else if(nums.length == 1) return;
        else {
        	for(int i = 0; i < nums.length - 1; i++){
        		if(nums[i] == 0){
        			for(int j = i; j < nums.length; j++){
        				if(nums[j] != 0){
        					int temp = nums[j];
        					nums[j] = nums[i];
        					nums[i] = temp;
        					break;
        				}
        			}
        		}
        	}
        }
    }
}
