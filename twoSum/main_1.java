package twoSum;

public class main_1 {
	public static void main(String[] args){
		twoSum2 solution = new twoSum2();
		int[] numbers = {11,7,15,2};
		int target = 9;
		int[] ans=solution.solution(numbers, target);
		System.out.println(ans[0]+","+ans[1]);
	}

}
