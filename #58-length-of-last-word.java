public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.equals("")) return 0;
		int count = 0;
		int start = s.length() - 1;
		while(start >= 0 && s.charAt(start) == ' '){
			start--;
		}
		while(start >= 0 && s.charAt(start) != ' '){
			start--;
			count++;
		}
		return count;
    }
}
