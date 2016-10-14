public class Solution {
    public String addBinary(String a, String b) {
        ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for(int i = 0; i < Math.max(a.length(), b.length()); i++){
			if(i < a.length()){
				A.add(Character.getNumericValue(a.charAt(i)));
			}
			else{
				A.add(0, 0);
			}
			if(i < b.length()){
				B.add(Character.getNumericValue(b.charAt(i)));
			}
			else{
				B.add(0, 0);
			}
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		int ten = 0;
		for(int i = A.size()-1; i >= 0; i--){
			int sum = A.get(i) + B.get(i) + ten;
			if(sum == 3){
				result.add(0, 1);
				ten = 1;
			}
			else if(sum == 2){
				result.add(0, 0);
				ten = 1;
			}
			else if(sum == 1){
				result.add(0,1);
				ten = 0;
			}
			else{
				result.add(0, 0);
				ten = 0;
			}
		}
		String outcome = "";
		if(ten > 0) outcome += ten + "";
		for(int i = 0; i < result.size(); i++){
			outcome += String.valueOf(result.get(i));
		}
		return outcome;
    }
}
