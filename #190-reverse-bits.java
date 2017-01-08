public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String ori = Integer.toBinaryString(n);
        long result = 0;
        for(int i = 0; i < ori.length(); i++){
        	result += Character.getNumericValue(ori.charAt(ori.length() - 1 - i)) * Math.pow(2, 32-i-1);
        }
        return (int) result;
    }
}
