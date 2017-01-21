public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int maxLength = 0;
        while (i < nums.length) {
            if (nums[i] == 1){
                int length = 1;
                while ((i+1) < nums.length && nums[i+1] != 0){
                    length++;
                    i++;
                }
                if(length > maxLength) maxLength = length;
            }
            i++;
        }
        return maxLength;
}
