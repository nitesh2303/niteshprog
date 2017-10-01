import java.util.Scanner;
public class GamlingSimulator{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter stake value:");
		int stake=sc.nextInt();
		System.out.println("Enter goal value:");
		int goal=sc.nextInt();
		System.out.println("Enter number of times:");
		int noOfTimes=sc.nextInt();
		
		int bets=0;
		int wins=0;
		for (int i=0; i< noOfTimes; i++) 
		{
			int cash = stake;    
			while (cash > 0 && cash < goal)
			{
				bets++;
				if (Math.random() < 0.5) 
					cash++;     // win 
				else                     
					cash--;     // lose 
			}
	            if (cash == goal) 
	            	wins++;                // to find no. of wins   
		}
		System.out.println();
		System.out.println(wins + " wins of " + noOfTimes);
		System.out.println("Percent of games won = " + 100.0 * wins / noOfTimes);
		System.out.println("Avg # bets           = " + 1.0 * bets / noOfTimes);


	}
}