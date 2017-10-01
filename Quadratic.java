import java.util.Scanner;
public class Quadratic{
	public static void main(String[] args){
		System.out.println("Enter the value of a,b,c of equation(a*x*x+b*x+c):");
		int a,b,c;
		double x1,x2,delta;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		//finding discriminant of equation (a*x*x+b*x+c)
		delta=((b*b)-(4*a*c));
		//finding second root of equation (a*x*x+b*x+c)
		x1=(-b+Math.sqrt(delta))/(2*a);
		System.out.println("First root of equation is:"+x1);
		//finding second root of equation (a*x*x+b*x+c)
		x2=(-b-Math.sqrt(delta))/(2*a);
		System.out.println("Second root of equation is:"+x2);
	}
}