public class Solution {
    public int strStr(String haystack, String needle) {
        String temp  = "";
		for(int i = 0; i + needle.length() - 1 < haystack.length(); i++){
			temp = haystack.substring(i, i+needle.length());
			if(temp.equals(needle)) return i;
		}
		return -1;
    }
}
