public class Solution {
    public char findTheDifference(String s, String t) {
        ArrayList<Character> temp = new ArrayList<Character>();
        for(int i = 0; i < t.length(); i++){
        	temp.add(t.charAt(i));
        }
        for(int j = 0; j < s.length(); j++){
        	Character temporary = new Character(s.charAt(j));
        	temp.remove(temporary);
        }
        return temp.get(0);
    }
}
