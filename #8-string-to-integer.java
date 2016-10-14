public class Solution {
    public int myAtoi(String str) {
        char [] charArray = str.toCharArray();
		ArrayList<Character> nws = new ArrayList<Character>();
		int firstInd = 0;
		boolean allWhite = true;
		for(int i = 0; i < charArray.length; i++){
			if(!Character.isWhitespace(charArray[i])){
				firstInd = i;
				allWhite = false;
				break;
			}
		}
		if(allWhite) return 0;
		char sign = charArray[firstInd];
		if(charArray[firstInd]=='+'||charArray[firstInd]=='-'){
			if(firstInd < charArray.length-1){
				nws.add(charArray[firstInd]);
				firstInd++;
			}
			else return 0;
		}
		for(int j = firstInd; j < charArray.length; j++){
			char ch = charArray[j];
			if(Character.isDigit(ch)){
				nws.add(ch);
			}
			else break;
		}
		long result = 0;
		if(sign == '-'){
			for(int i = 1; i < nws.size(); i++){
				int pow = nws.size()-i-1;
				result -= Math.pow(10, pow) * Character.getNumericValue(nws.get(i));
			}
		}
		else if(sign == '+'){
			for(int i = 1; i < nws.size(); i++){
				int pow = nws.size()-i-1;
				result += Math.pow(10, pow) * Character.getNumericValue(nws.get(i));
			}
		}
		else{
			for(int i = 0; i < nws.size(); i++){
				int pow = nws.size()-i-1;
				result += Math.pow(10, pow) * Character.getNumericValue(nws.get(i));
			}
		}
		if(result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
		else if(result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
		else return (int) result;
	}
}
