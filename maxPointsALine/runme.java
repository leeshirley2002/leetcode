package maxPointsALine;

public class runme {
	 public static void main(String args[]){
	        Point p1 = new Point(0,0);
	        Point p2 = new Point(0,0);
	        //Point p3 = new Point(1,0);
	        //Point p4 = new Point(2,2);
	        //Point p5 = new Point(4,3);
	        Point[] points = {p1,p2};
	        Solution s = new Solution();
	        System.out.println(s.maxPoints(points));
	    }
}
