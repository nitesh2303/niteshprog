public class Distance{
	public static void main(String[] args){
		int x,y;
		double distance;
		x=Integer.parseInt(args[0]);
		y=Integer.parseInt(args[1]);
		distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
		System.out.println("Distance is from origin(0,0) to (x,y)");
		System.out.println("Distance="+distance);
		
	}
}