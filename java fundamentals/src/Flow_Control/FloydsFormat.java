package Flow_Control;

public class FloydsFormat 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		if(args.length==0)
		{
			System.out.println("please enter an integer number");
			System.exit(0);	
		}
		int rowCount=Integer.parseInt(args[0]);
		for(int i=0;i<rowCount;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
