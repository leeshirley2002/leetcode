package Count_And_Say;

public class Solution1 {
	public String countAndSay(int n){
		String result ="1";
		if(n==1){
			return "1";
		}
		int i=1;
		int num=1;
		String temp ="";
		while(i<n){
			for(int j=1;j<result.toCharArray().length;j++){
				if(result.toCharArray()[j]==result.toCharArray()[j-1]){
					num++;
				}else{
					temp = temp +String.valueOf(num)+String.valueOf(result.toCharArray()[j-1]);
					num=1;
				}
     		}
			result=temp+String.valueOf(num)+String.valueOf(result.toCharArray()[result.toCharArray().length-1]);
			i++;
			num=1;
			temp="";
		}
		return result;
	}
}
