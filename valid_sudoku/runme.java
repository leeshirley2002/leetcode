package valid_sudoku;

public class runme {
	public static void main(String[] args){
		char[][] board = new char[9][9];
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				int stuff =(int)(Math.random()*1000);
				if(j==8){
					System.out.println(stuff+" ");
					System.out.println();
				}else{
					System.out.print(stuff+" ");
				}
				board[i][j]=(char)(stuff);
			}
		}
		Solution s = new Solution();
		System.out.println(s.isValidSudoku(board));
	}
}
