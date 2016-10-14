public class Solution {
    public boolean isHappy(int n) {
        String N = String.valueOf(n);
		ArrayList<Integer> values = new ArrayList<Integer>();
		values.add(n);
        while(!N.equals("1")){
        	int sum = 0;
        	for(int i = 0; i < N.length(); i++){
        		sum += Math.pow(Character.getNumericValue(N.charAt(i)), 2);
        	}
        	if(!values.contains(sum)){
        		values.add(sum);
        		N = String.valueOf(sum);
        	}
        	else return false;
        }
        return true;
    }
}
