public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int pointer1 = m - 1;
		int pointer2 = n - 1;
		int position = m + n - 1;
		if(m == 0){
			for(int i = 0; i < n; i++){
				nums1[i] = nums2[i];
			}
		}
		if(n == 0) return;
		while(pointer1 >= 0 && pointer2 >= 0){
			if(nums1[pointer1] > nums2[pointer2]){
				nums1[position] = nums1[pointer1];
				pointer1--;
				if(pointer1 < 0)
					for(int i = 0; i < position; i++){
						nums1[i] = nums2[i];
					}
			}
			else{
				nums1[position] = nums2[pointer2];
				pointer2--;
				if(pointer2 < 0) return;
			}
			position--;
		}
    }
}
