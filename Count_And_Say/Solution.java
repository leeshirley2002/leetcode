package Count_And_Say;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Solution {
	public String countAndSay(int n){
		//char start = '1';
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		String result ="1";
		boolean repeat = false;
		if(n==1){
			return "1";
		}
		int i=1;
		while(i<n){
			for(int j=0;j<result.toCharArray().length;j++){
				if(!map.containsKey(result.toCharArray()[j])){
					map.put(result.toCharArray()[j],1);
				}else{
					int value =map.get(result.toCharArray()[j]);
					value++;
					map.put(result.toCharArray()[j],value);
				}
			}
			result="";
			Set entries = map.entrySet();
			Iterator iter = entries.iterator();
			while(iter.hasNext()){
				Map.Entry entry  = (Map.Entry)iter.next();
				Object key =entry.getKey();
				Object val =entry.getValue();
				result=result + String.valueOf(val)+String.valueOf(key);
			}
			map.clear();
			i++;
			System.out.println("result: "+result);
		}
		
		return result;
	}
}
