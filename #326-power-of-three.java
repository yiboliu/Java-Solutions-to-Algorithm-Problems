public class Solution {
    public boolean isPowerOfThree(int n) {
        if(n == 0) return false;
		else if(n % 3 != 0 && n > 1) return false;
        else if(n == 1) return true;
        else{
        	return isPowerOfThree(n/3);
        }
    }
}
