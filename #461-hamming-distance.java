public class Solution {
    public int hammingDistance(int x, int y) {
        int z = x ^ y;
//        String binary = Integer.toBinaryString(z);
//        char [] bin = binary.toCharArray();
        int sum = 0;
//        for (int i = 0; i < bin.length; i++) {
//        	sum += Character.getNumericValue(bin[i]);
//        }
        while(z > 0){
        	sum += z % 2;
        	z /= 2;
        }
        return sum;
    }
}
