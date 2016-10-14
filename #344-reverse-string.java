public class Solution {
    public String reverseString(String s) {
        char [] chay = s.toCharArray();
        char [] newChay = new char[s.length()];
        int i = 0;
        int j = s.length()-1;
        while(i < s.length()){
        	newChay[i] = chay[j];
        	i++;
        	j--;
        }
        String ns = new String (newChay);
        return ns;
    }
}
