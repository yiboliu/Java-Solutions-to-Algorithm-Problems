public class Solution {
    public String toHex(int num) {
        String bin = Integer.toBinaryString(num);
		int com = bin.length() % 4;
		char [] arr;
		boolean buchong = true;
		if (com > 0) arr = new char[bin.length() + 4 - com];
		else {
			arr = new char[bin.length()];
			buchong = false;
		}
		int i = 0;
		if(buchong)
			if (num >= 0) {
				for (; i < 4 - com; i++) {
					arr[i] = '0';
				}
			}
			else {
				for (; i < 4 - com; i++) {
					arr[i] = '1';
				}
			}
        for (int j = 0; i < arr.length; i++, j++) {
    		arr[i] = bin.charAt(j);
    	}
        String result = "";
        for (int m = 0; m < arr.length; m += 4) {
        	int temp = 0;
        	for (int n = 0; n < 4; n++) {
            	temp += Character.getNumericValue(arr[m + n]) * Math.pow(2, 3 - n);
            }
        	if(temp > 9) {
        		result += (char)(87 + temp) + "";
        	}
        	else result += temp + "";
        }
        return result;
    }
}
