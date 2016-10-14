public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() == 0) return true;
		else if(ransomNote == null || magazine == null || magazine.length() == 0) return false;
		while(ransomNote.length() > 0){
			int initial = 0;
			boolean end = true;
			for(int i = 0; i < magazine.length(); i++){
				if(ransomNote.charAt(initial) == magazine.charAt(i)){
					if(initial == ransomNote.length() - 1)
						return true;
					else{
						magazine = magazine.substring(0, i) + magazine.substring(i + 1);
						ransomNote = ransomNote.substring(initial + 1);
						end = false;
					}
				}
			}
			if(end) return false;
		}
		return false;
    }
}
