package Count_And_Say;

public class Solution2 {
	public String countAndSay(int n){
		String result="";
		int i=0;
		if(n==1){
			return "1";
		}
		while(i<n){
			int m=0;
			for(int j=0;j<result.toCharArray().length;j++){
				if(result.toCharArray()[j]==result.toCharArray()[j+1]){
					m++;
				}else{
					
				}
			}
			
		}
		return null;
	}

}
