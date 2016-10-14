public class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i < 9; i++){
			char [] tempRow = board [i];
			boolean [] determinerR =  new boolean[9];
			boolean [] determinerC =  new boolean[9];
			for(int j = 0; j < 9; j++){
				if(tempRow[j]!='.'){
					if(!determinerR[Character.getNumericValue(tempRow[j]) - 1])
						determinerR[Character.getNumericValue(tempRow[j]) - 1] = true;
					else return false;
				}
				if(board[j][i] != '.'){
					if(!determinerC[Character.getNumericValue(board[j][i]) - 1])
						determinerC[Character.getNumericValue(board[j][i]) - 1] = true;
					else return false;
				}
			}
		}
		for(int subOutR = 0; subOutR < 9; subOutR += 3){
			for(int subOutC = 0; subOutC < 9; subOutC += 3){
				boolean [] determinerSub =  new boolean[9];
				for(int subInR = 0; subInR < 3; subInR++){
					for(int subInC = 0; subInC < 3; subInC++){
						if(board[subOutR+subInR][subOutC+subInC] != '.'){
							if(!determinerSub[Character.getNumericValue(board[subOutR+subInR][subOutC+subInC]) - 1])
								determinerSub[Character.getNumericValue(board[subOutR+subInR][subOutC+subInC]) - 1] = true;
							else return false;
						}
					}
				}
			}
		}
        return true;
    }
}
