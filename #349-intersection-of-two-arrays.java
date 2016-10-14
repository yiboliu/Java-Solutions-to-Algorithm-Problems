public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < nums1.length; i++){
        	for(int j = 0; j < nums2.length; j++){
        		if(nums1[i] == nums2[j] && !result.contains(nums1[i])) result.add(nums1[i]);
        	}
        }
        int [] end = new int[result.size()];
        for(int k = 0; k < end.length; k++){
        	end[k] = result.get(k);
        }
        return end;
    }
}
