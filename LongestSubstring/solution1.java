package LongestSubstring;

import java.util.HashMap;

public class solution1 {
public int lengthOfLongestSubstring(String s) {
		char[] ss = s.toCharArray();
		int len = s.length();
		HashMap<Character, Integer> map = new HashMap<Character,Integer>();
		int pre = 0;
		for(int i=0;i<len;i++){
			if(!map.containsKey(ss[i])){
				map.put(ss[i], i);
			}
			else{
				
				i = map.get(ss[i]);
				map.clear();
			}
			if(map.size()>pre){
				pre = map.size();
			}
				
		}
		return pre;
	}
}