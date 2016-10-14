public class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        if(s.length() == 0 && t.length() == 0) return true;
        ArrayList<Character> T = new ArrayList<Character>();
        for(int i = 0; i < t.length(); i++){
        	T.add(new Character(t.charAt(i)));
        }
        for(int j = 0; j < s.length(); j++){
        	if(!T.remove(new Character(s.charAt(j)))) return false;
        }
		return T.isEmpty();
    }
}
