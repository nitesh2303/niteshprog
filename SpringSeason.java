import java.util.*;
public class SpringSeason{
    public static void main(String[] args){
	int date,month;
	date=Integer.parseInt(args[0]);
	month=Integer.parseInt(args[1]);
	if(date>=20 && date<=31 && month==3)
	{
	System.out.println("true");
	}
	else if(date>=1 && date<=30 && month==4)
	{
	System.out.println("true");
	}
	else if(date>=1 && date<=31 && month==5)
	{
	System.out.println("true");
	}
	else if(date>=20 && date<=30 && month==6)
	{
	System.out.println("true");
	}
	else
	System.out.println("false");
	}
}