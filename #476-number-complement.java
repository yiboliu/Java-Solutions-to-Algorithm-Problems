public class Solution {
    public int findComplement(int num) {
        int mask = (int) (Math.pow(2, Integer.toBinaryString(num).length()) - 1);
        return num^mask;
    }
}
