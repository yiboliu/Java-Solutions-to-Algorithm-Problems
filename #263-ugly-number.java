public class Solution {
    public boolean isUgly(int num) {
        if(num == 1) return true;
        else if(num == 0) return false;
        else {
        	int temp = num;
        	while(temp != 1){
        		if(temp % 2 == 0){
        			temp /= 2;
        		}
        		else if(temp % 3 == 0){
        			temp /= 3;
        		}
        		else if(temp % 5 == 0){
        			temp /= 5;
        		}
        		else return false;
        	}
        	return true;
        }
    }
}
