package Length_of_last_word;

public class Solution {
	public int lengthOfLastWord(String s){
		char[] ss =s.toCharArray();
		int i = ss.length-1;
		int result =0;
		boolean flag = false;
		if(ss.length==0){
			return 0;
		}
		while(i>=0){
			if(ss[i]!=' '){
				flag=true;
			}
			if(flag){
				if(ss[i]!=' '){
					result++;
				}else{
					break;
				}
			}
			i--;
		}
		return result;
	}

}
