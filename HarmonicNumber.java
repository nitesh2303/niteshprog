public class HarmonicNumber{
	public static void main(String[] args){
		int num;
		num=Integer.parseInt(args[0]);
		double sum=0.0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+(double) 1/i;
		}
		System.out.println("sum of harmonic series="+sum);
	}
}