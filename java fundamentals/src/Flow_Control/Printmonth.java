package Flow_Control;

import java.time.Month;

public class Printmonth
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		if(args.length==0)
		{
			System.out.println("enter the month in numbers");
			System.exit(0);
		}
		int month=Integer.parseInt(args[0]);
			if(month<1||month>12)
		{
				System.out.println("invalid month");
				System.exit(0);
		}
		String monthStr=Month.of(month).name();
		monthStr=monthStr.substring(0, 1).toUpperCase()+monthStr.substring(1).toLowerCase();
		System.out.println(monthStr);	

	}

}
