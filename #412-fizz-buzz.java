public class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<String>();
        for(int i = 1; i <= n; i++) {
        	String temp = "";
        	if(i % 3 == 0) temp += "Fizz";
        	if(i % 5 == 0) temp += "Buzz";
        	if(!(i % 3 == 0 || i % 5 == 0)) temp += i + "";
        	result.add(temp);
        }
        return result;
    }
}
