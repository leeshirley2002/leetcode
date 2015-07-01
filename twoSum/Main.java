package twoSum;


public class Main {
	public static void main(String[] args){
		twoSum2 sol = new twoSum2();
		int[] numbers = new int[]{11,7,15,2};
		int target = 9;
		int[] ans = new int[2];
		ans = sol.solution(numbers, target);
		System.out.println(ans[0] +","+ans[1]);
	}

}
