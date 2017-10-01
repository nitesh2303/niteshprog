import java.util.Scanner;
public class PowerOf2
{
     public static void main(String[] args)
     {
        int n,i = 0,power = 1;
		System.out.println("Enter the value of n:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
        System.out.println("Powers of 2 that are less than 2^"+n);
        while (i <= n)
        {
            System.out.println("2^"+i+" = " + power);
            power = power * 2;
            i++;
        }
    }
}