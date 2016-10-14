public class Solution {
    public int[] plusOne(int[] digits) {
       if(digits.length == 1){
			if(digits[0] == 9){
				int [] ten = new int [2];
				ten[0] = 1;
				ten[1] = 0;
				return ten;
			}
			else{
				digits[0]++;
				return digits;
			}
		}
		boolean overflow = true;
		int [] result = new int [digits.length];
		for(int i = digits.length - 1; i >= 0; i--){
			if(digits[i] < 9) overflow = false;
			result[i] = digits[i];
		}
		result [result.length - 1] = digits[digits.length - 1] + 1;
		for(int i = digits.length - 1; i > 0; i--){
			if(result[i] == 10){
				result[i] = 0;
				result[i-1]++;
			}
		}
		if(overflow){
			int [] newDigits = new int [digits.length + 1];
			newDigits[0] = 1;
			for(int j = 1; j < newDigits.length; j++){
				newDigits[j] = 0;
			}
			return newDigits;
		}
		return result;
    }
}
