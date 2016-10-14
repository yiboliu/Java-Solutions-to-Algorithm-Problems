public class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
		int newLength = nums.length;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] == val){
        		int j = i;
        		while(nums[j] == val){
        			if(j == nums.length-1){
        				if(i == 0){
        					nums = new int [0];
        					return 0;
        				}
        				break;
        			}
        			newLength--;
        			j++;
        		}
        		for(int k = 0; j + k < nums.length; k++){
        			nums[i+k] = nums[j+k];
        		}
        	}
        }
        return newLength;
    }
}
