package twoSum;

public class twoSum_1 {
	public int[] solution(int[] numbers, int target){
		int len = numbers.length;
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if(numbers[i]+numbers[j]==target && j>i){
					int ans1=i+1;
					int ans2=j+1;
					System.out.println(ans1+","+ans2);
				}
			}
		}
		return null;
		
	}

}
