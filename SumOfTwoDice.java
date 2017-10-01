public class SumOfTwoDice{
	public static void main(String[] args){
		int dice1,dice2,sum=0,min=1,max=6;
		//for first dice
		dice1=min+(int)(Math.random()*(max-min+1));
		System.out.println("Number on dice1="+dice1);
		//for second dice
		dice2=min+(int)(Math.random()*(max-min+1));
		System.out.println("number on dice2="+dice2);
		//Adding of two dice
		sum=dice1+dice2;
		System.out.println("sum="+sum);
	} 
}