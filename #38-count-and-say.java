public class Solution {
    public String countAndSay(int n) {
        String one = "1";
		while(n - 1 > 0){
			String tempOne = one;
			n--;
			int count = 0;
			String temp ="";
			for(int i = 0; i < tempOne.length(); i++){
				if(i == tempOne.length() - 1){
					count++;
					one = temp + count + "" + tempOne.charAt(i);
				}
				else{
					if(tempOne.charAt(i) != tempOne.charAt(i + 1)){
						count++;
						temp += count + "" + tempOne.charAt(i);
						count = 0;
					}
					else{
						count++;
					}
				}
			}
		}
		return one;
    }
}
