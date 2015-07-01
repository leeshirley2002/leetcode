package maxPointsALine;
import java.util.HashMap;

public class Solution {
	public int maxPoints(Point[] points){
		HashMap<Double,Integer> map = new HashMap<Double,Integer>();
		int length = points.length;
		if(length==0){
			return 0;
		}
		if(length==1){
			return 1;
		}
		int dup =1;
		int max=0;
		for(int i=0;i<length;i++){
			map.clear();
			dup=1;
			double slope = 0.0;
			for(int j=i+1;j<length;j++){
				if(points[i].x==points[j].x && points[i].y==points[j].y){
					dup++;
					continue;
				}else if(points[i].x==points[j].x){
					slope = Double.MAX_VALUE;
				}else{
					slope = points[i].y==points[j].y? 0:1.0*(points[i].y-points[j].y)/(points[i].x-points[j].x);
				}
				map.put(slope, map.containsKey(slope) ? map.get(slope)+1:1);
			}
			if(map.size()==0){
				max=Math.max(max, dup);
			}
			for(Double key : map.keySet()){
				max=Math.max(map.get(key)+dup, max);
			}
			
			System.out.println(max);
		}
		return max;
	}
}
