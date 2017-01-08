public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(long n) {
        if (n == 0) return 0;
        int sum = 0;
        while(n > 0) {
        	sum += n % 2;
        	n /= 2;
        }
        if (sum == 0) return 1;
        return sum;
    }
}
