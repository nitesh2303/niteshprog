public class Binary{
	public static void main(String[] args){
		int a,i=0;
		int b[]=new int[100];
		//Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(args[0]);
		System.out.println("Enter the number:");
		while(n>0){
			a=n%2;
			b[i]=a;
			n=n/2;
			i++;
		}
		System.out.print("Entered integer in binary form is: ");
		for(int j=0;j<i;j++)
		{
			System.out.print(b[j]);
		}
	}
}