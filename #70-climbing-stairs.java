import java.math.*;
public class Solution {
    public int climbStairs(int n) {
        int permutation = 0;
        int one = 0;
        int two = 0;
        for(one = 0; one <= n; one++){
        	if((n - one) % 2 == 0){
        		two = (n - one) / 2;
        		int total = one + two;
        		BigInteger nominator = BigInteger.ONE;
        		for(int i = one + 1; i <= total; i++){
        			BigInteger multiplier = new BigInteger(String.valueOf(i));
        			nominator = nominator.multiply(multiplier);
        		}
        		BigInteger denominator = BigInteger.ONE;
        		for(int j = 1; j <= two; j++){
        			BigInteger multiplier = new BigInteger(String.valueOf(j));
        			denominator = denominator.multiply(multiplier);
        		}
        		permutation += nominator.divide(denominator).intValue();
        	}
        }
        return permutation;
    }
}
