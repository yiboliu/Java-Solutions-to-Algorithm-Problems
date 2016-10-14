public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> intersect = new ArrayList<Integer>();
        boolean [] dupli1 = new boolean [nums1.length];
        boolean [] dupli2 = new boolean [nums2.length];
        for(int i = 0; i < nums1.length; i++){
        	for(int j = 0; j < nums2.length; j++){
        		if(nums1[i] == nums2[j] && !dupli1[i] && !dupli2[j]){
        			intersect.add(nums1[i]);
        			dupli1[i] = true;
        			dupli2[j] = true;
        		}
        	}
        }
        int [] result = new int[intersect.size()];
        for(int k = 0; k < intersect.size(); k++){
        	result[k] = intersect.get(k);
        }
        return result;
    }
}
