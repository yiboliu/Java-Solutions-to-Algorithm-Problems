public class Solution {
    public boolean isPowerOfFour(int num) {
        while(num % 4 == 0 && num > 1) {
        	num /= 4;
        }
        if (num != 1) return false;
        else return true;
    }
}
