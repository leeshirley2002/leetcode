package add_binary;

import java.util.Arrays;

public class Solution {
	public String addBinary(String a, String b){
		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();
		int length_a= ac.length;
		int length_b = bc.length;
		char[] shorter=null;
		char[] longer=null;
		if(length_a == 0){
			return b;
		}
		if(length_b==0){
			return a;
		}
		if(length_a >= length_b){
			shorter = bc;
			longer =ac;
		}else{
			shorter = ac;
			longer = bc;
		}
		int[] result = new int[longer.length+1];;
		Arrays.fill(result, 0);
		int i =longer.length;
		int m =longer.length-1;
		int n = shorter.length-1;
		int res=0;
		while(i>0){
			if(n<0){
				if((int)longer[m]+res-48>=2){
					result[i]=((int)longer[m]+res-48)%2;
					res =1;
				}else{
					result[i]=longer[m]+res-48;
					res =0;
				}
				i--;
				m--;
				n--;
				continue;
			}
			if((int)longer[m]+(int)shorter[n]+res-96>=2){
				result[i]=((int)longer[m]+(int)shorter[n]+res-96)%2;
				res=1;
			}else{
				result[i]=(int)longer[m]+(int)shorter[n]+res-96;
				res=0;
			}
			i--;
			m--;
			n--;
		}
		result[0]=res;
		System.out.println(res);
		int k=0;
		String output ="";
		while(k<result.length){
		
				output = output+String.valueOf(result[k]);
			
	
		}
		return output;
	}
}
