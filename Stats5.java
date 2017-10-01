public class Stats5{
	public static void main(String[] args){
		float avg=0,min=0,max=1,sum=0;
		float num[]=new float[5];
		//float maximum=num[0],minimum=num[0];
		for(int i=0;i<5;i++){
		num[i]=min+(float)(Math.random()*(max-min+1));
		System.out.println("Num["+(i+1)+"]="+num[i]);
		sum=sum+num[i];
		}
		avg=sum/5;
		System.out.println("Average="+avg);
		//System.out.println("maximum="+maximum);
		//System.out.println("minimum="+minimum);
	} 
}