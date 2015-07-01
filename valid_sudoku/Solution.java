package valid_sudoku;

import java.util.HashMap;

public class Solution {
	public boolean isValidSudoku(char[][] board){
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				if(map.containsKey(board[i][j])){
					System.out.println(i+","+j+"row");
					System.out.println(map.size());
					map.clear();
					return false;
				}
				if(board[i][j]!='.'){
					map.put(board[i][j], j);
				}
				if(j==8){
					map.clear();
				}
			}
		}
		for(int j=0;j<9;j++){
			for(int i=0;i<9;i++){
				if(map.containsKey(board[i][j])){
					System.out.println(i+","+j+"column");
					System.out.println(map.size());
					map.clear();
					return false;
				}
				if(board[i][j]!='.'){
					map.put(board[i][j], i);
				}
				if(i==8){
					map.clear();
				}
			}
		}
		for(int i=0;i<7;i=i+3){
			for(int j=0;j<7;j=j+3){
				for(int k=0;k<3;k++){
					for(int l=0;l<3;l++){
						if(map.containsKey(board[i+k][j+l])){
							System.out.println((i+k)+","+(j+l)+"squre");
							System.out.println(map.size());
							map.clear();
							return false;
						}
						if(board[i+k][j+l]!='.'){
							map.put(board[i+k][j+l],i);
						}
						if(k==2&&l==2){
							map.clear();
						}
						
					}
				}
			}
		}
		
		return true;
	}
}
