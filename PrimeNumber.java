import java.util.Scanner;
public class PrimeNumber{
	 public static int isPrime(int i)
	 {
		int flag=0;
		for(int j=2;j<i;j++)
		{
			if(i%j==0)
			{
			
				flag=1;
				break;
			}
		}
		return flag;
	}
	public static void main(String Args[])
	{
		int a,b;
		System.out.println("Insert the range:");
		Scanner sc = new Scanner(System.in);
		System.out.print("From: ");
		a=sc.nextInt();
		System.out.print("To: ");
		b=sc.nextInt();
		System.out.print("Prime Numbers Are: ");
		for(int k=a;k<=b;k++)
		{
			if(k==1)
			continue;
			if(isPrime(k)==0)
			{
				System.out.print(" "+k);
			}
		}
	}
}