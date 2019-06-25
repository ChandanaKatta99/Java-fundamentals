package Flow_Control;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		num=Integer.parseInt(args[0]);
		if(num>0)
		{
			System.out.println("num is positive");
		}
		else if(num<0)
		{
			System.out.println("num is negative");
		}
		else
		{
			System.out.println("num is zero" );
		}

	}

}
