public class Solution {
    public int addDigits(int num) {
        int result = 10;
        String temp = String.valueOf(num);
        while(result >= 10){
        	result = 0;
        	for(int i = 0; i < temp.length(); i++){
        		result += Character.getNumericValue(temp.charAt(i));
        	}
        	temp = String.valueOf(result);
        }
        return result;
    }
}
