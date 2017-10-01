class CarLoan
{
	public static void main(String[] args)
	{
		double p=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double r=Double.parseDouble(args[2]);
		double k=r/(12*100);
		double n=12*y;
		double payment=(p*k)/(1-Math.pow((1+k),-n));
		System.out.println("Payment = "+payment);
	}

}