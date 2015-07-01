package anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Solution {
	public List<String> anagrams(String[] strs){
		ArrayList<String> result = new ArrayList<String>();
		int length = strs.length;
		if(length==0){
			return null;
		}
		HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
		for(int i=0;i<length;i++){
			char[] chararray = strs[i].toCharArray();
			Arrays.sort(chararray);
			String str = new String(chararray);
			if(map.containsKey(str)){
				map.get(str).add(strs[i]);
			}else{
				ArrayList<String> list = new ArrayList<String>(); 
				list.add(strs[i]);
				map.put(str,list);
			}
		}
		Iterator iter = map.values().iterator();
		while(iter.hasNext()){
			ArrayList<String> item = (ArrayList<String>)iter.next();
			if(item.size()>1){
				result.addAll(item);
			}
		}
		return result;
	}
}
