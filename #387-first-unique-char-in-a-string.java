public class Solution {
    public int firstUniqChar(String s) {
        ArrayList<Character> elements = new ArrayList<Character>();
		ArrayList<Boolean> repeat = new ArrayList<Boolean>();
		for(int i = 0; i < s.length(); i++){
			if(!elements.contains(s.charAt(i))){
				elements.add(s.charAt(i));
				repeat.add(false);
			}
			else{
				repeat.set(elements.indexOf(s.charAt(i)), true);
			}
		}
		for(int j = 0; j < repeat.size(); j++){
			if(repeat.get(j) == false) return s.indexOf(elements.get(j));
		}
        return -1;
    }
}
