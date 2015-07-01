package twoSum;

import java.util.HashMap;


public class hashMap {
	public static void main(String[] args){
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("apple", "pingguo");
		map.put("computer", "jisuanji");
		map.put("book", "shu");
		String key="book";
		boolean contains = map.containsKey(key);
		if(contains){
			System.out.println("baohan"+key);
			
		}
	}

}
