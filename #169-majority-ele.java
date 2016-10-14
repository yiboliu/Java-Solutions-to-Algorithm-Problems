public class Solution {
    public int majorityElement(int[] nums) {
        ArrayList<Integer> elements = new ArrayList<Integer>();
        ArrayList<Integer> count = new ArrayList<Integer>();
		for(int i = 0; i < nums.length; i++){
			if(!elements.contains(nums[i])){
				elements.add(nums[i]);
				count.add(1);
			}
			else{
				count.set(elements.indexOf(nums[i]), count.get(elements.indexOf(nums[i])) + 1);
			}
		}
		int largest = 0;
		for(int j = 0; j < count.size(); j++){
			if(largest < count.get(j)) largest = count.get(j);
		}
		return elements.get(count.indexOf(largest));
    }
}
