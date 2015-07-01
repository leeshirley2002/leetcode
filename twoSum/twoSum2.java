package twoSum;

import java.util.HashMap;

public class twoSum2 {
	public int[] solution(int[]numbers, int target){
		int len = numbers.length;
		int[] ans = new int[2];
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<len;i++){
			if(!map.containsKey(numbers[i])){
				map.put(target-numbers[i], i);
			}else{
				ans[0]=map.get(numbers[i])+1;
				ans[1]=i+1;
			}
			
		}
		return ans;
	}

}
