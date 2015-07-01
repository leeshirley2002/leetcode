package add_binary;

public class Solution1 {
	public String addBinary(String a,String b){
		StringBuilder sb_a = new StringBuilder(a);
		StringBuilder sb_b = new StringBuilder(b);
		StringBuilder longer = new StringBuilder();
		StringBuilder shorter = new StringBuilder();
		int len_a = sb_a.length();
		int len_b = sb_b.length();
		if(len_a==0){
			return b;
		}
		if(len_b==0){
			return a;
		}
		StringBuilder result = new StringBuilder();
		if(len_a>=len_b){
			longer = sb_a;
			shorter = sb_b;
		}else{
			longer = sb_b;
			shorter = sb_a;
		}
		int i = longer.length()-1;
		int j = shorter.length()-1;
		int res =0;
		while(i>=0){
			int longer_i=Integer.parseInt(String.valueOf(longer.charAt(i)));
			if(j>=0){
				int shorter_j = Integer.parseInt(String.valueOf(shorter.charAt(j)));
				if(longer_i+shorter_j+res>=2){
					result.append((longer_i+shorter_j+res)%2);
					res=1;
				}else{
					result.append(longer_i+shorter_j+res);
					res=0;
				}
			}else{
				if(longer_i+res>=2){
					result.append((longer_i+res)%2);
					res=1;
				}else{
					result.append(longer_i+res);
					res=0;
				}
			}
			i--;
			j--;
		}
		if(res!=0){
			result.append(res);
		}
		return result.reverse().toString();
	}
}
