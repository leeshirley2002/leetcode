package Plus_One;

import java.util.Arrays;

public class Solution {
	public int[] plusOne(int[] digits){
		int length =digits.length;
		int i=length-1;
		if(length == 0){
			return null;
		}
		while(i>=0){
			if(i==0&&digits[i]==9){
				int[] result = new int[length+1];
				Arrays.fill(result, 0);
				result[0]=1;
				return result;
			}
			if((digits[i]+1)!=10){
				digits[i]++;
				break;
			}
			else{
				digits[i]=0;
				i--;
			}
		}
		return digits;
	}
}
