import java.util.Scanner;
public class TemperatureConversion{
	double celcius,fahrenheit,cel,fah;
    Scanner sc = new Scanner(System.in);
    public double celciusToFahrenheit()
    {
        System.out.println("Enter temperature in celcius:");
        cel=sc.nextDouble();
        fahrenheit=(cel*9/5)+32;
        return fahrenheit;
    }
    public double fahrenheitToCelcius()
    {
        System.out.println("Enter temperature in fahrenheit:");
		fah=sc.nextDouble();
		celcius=(fah-32)*5/9;
		return celcius;
    }	
	public static void main(String[] args){
		int choice;
		System.out.println("1:Celcius to Fahrenheit:");
		System.out.println("2:Fahrenheit to Celcius:");
		Scanner sc = new Scanner(System.in);
		choice=sc.nextInt();
		TemperatureConversion tc=new TemperatureConversion();
		switch(choice)
		{
			case 1:
			System.out.println("Temperature in fahrenheit="+tc.celciusToFahrenheit());
			break;
			case 2:
			System.out.println("Temperature in celcius="+tc.fahrenheitToCelcius());
			break;
			default:System.out.println("Invalid choice:");
		}
	}
}

	