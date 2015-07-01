package longestSub;

//import java.util.Arrays;

public class Solution {
	public int lengthOfLongestSubstring(String s){
		char[] ss = s.toCharArray();
		int start=0;
		int length=0;
		int max=0;
		for(int i=0;i<ss.length;i++){
			for(int j=start;j<=i-1;j++){
				if(ss[i]==ss[j]){
					length=i-start+1;
					start=j+1;
					//i=start;
					break;
				}
			}
			max=Math.max(max, length);
		}
		return max;
		}	
}
