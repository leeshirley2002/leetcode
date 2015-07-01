package longestSub_fast;

import java.util.Arrays;



public class Solution {
	public int lengthOfLongestSubstring(String s){
		char[] ss = s.toCharArray();
		int start =0;
		int[] tablelist = new int[256];
		int length=0;
		Arrays.fill(tablelist, -1);
		for(int point=0;point<ss.length;point++){
			
			if(tablelist[ss[point]]>=start){
				start=tablelist[ss[point]]+1;
				//point=tablelist[ss[point]]+1;
			}
			tablelist[ss[point]]=point;
			length=Math.max(length,point-start+1);
		}
		return length;
		
	}	

}
