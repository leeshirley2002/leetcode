package maxPointsALine;

import java.util.HashMap;

public class Solution1 {
	public int maxPoints(Point[] points){
		int length = points.length;
		if(length<=1){
			return length;
		}
		int max =0;
		HashMap<Double,Integer> map = new HashMap<Double,Integer>();
		for(int i=0;i<length;i++){
			int repeat=1;
			double slope =0.0;
			map.clear();
			for(int j=i+1;j<length;j++){
				if(points[i].x==points[j].x && points[i].y==points[j].y){
					repeat++;
				}else if(points[i].x==points[j].x){
					slope = Double.MAX_VALUE;
				}else{
					slope = points[i].y==points[j].y ? 0.0:1.0*(points[i].y-points[j].y)/(points[i].x-points[j].x);
				}
				map.put(slope, map.containsKey(slope) ? map.get(slope)+1:1);
			}
			if(map.size()==0){
				max=Math.max(max, repeat);
			}
			for(Double key : map.keySet()){
				max = Math.max(map.get(key)+repeat, max);
			}
		}
		
		return max;
	}
}
