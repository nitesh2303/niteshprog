import java.util.Scanner;
public class DoubleOpt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter the value of a,b and c:");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		System.out.println("Result of (a+b*c) is="+(a+b*c));
		System.out.println("Result of (a*b+c) is="+(a*b+c));
		System.out.println("Result of (c+a/b) is="+(c+a/b));
		System.out.println("Result of (a%b+c) is="+(a%b+c));
	}
}