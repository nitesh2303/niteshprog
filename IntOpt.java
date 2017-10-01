import java.util.Scanner;
public class IntOpt{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter the value of a,b and c:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		System.out.println("Result of (a+b*c) is="+(a+b*c));
		System.out.println("Result of (a*b+c) is="+(a*b+c));
		System.out.println("Result of (c+a/b) is="+(c+a/b));
		System.out.println("Result of (a%b+c) is="+(a%b+c));
	}
}