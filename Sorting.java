import java.util.Scanner;
public class Sorting{
	public static void main(String[] args){
		
		int a[]=new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Entered number in array is:");
		for(int i=0;i<10;i++)
		{
			System.out.print(" "+a[i]);
		}
		for(int i=1;i<10;i++)
		{
			for(int j=0;j<10-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("\nEntered array in accending order is:");
		for(int i=0;i<10;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println("\nSecond lowest number= "+a[1]);
		System.out.println("Second highest number is= "+a[8]);
	}
}