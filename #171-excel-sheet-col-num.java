public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for(int i = s.length() - 1, j = 0; i >= 0; i--, j++){
        	result += (s.charAt(i) - 64) * Math.pow(26, j);
        }
        return result;
    }
}
