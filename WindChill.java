import java.util.*;
class WindChill
{
	public static void main(String[] args)
	{
		
		int t=Integer.parseInt(args[0]);
		int v=Integer.parseInt(args[1]);
		if(t>50||v>120||v<3)
			System.out.println("Not valid for this data t<50 & 3<v<120");
		else{
		double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
		System.out.println("Result="+w);
		}		
	}	
}