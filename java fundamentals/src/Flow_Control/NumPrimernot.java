package Flow_Control;

public class NumPrimernot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length==0)
		{
			System.out.println("please enter an integer");
			System.exit(0);
		}
		int number=Integer.parseInt(args[0]);
			if(number==0||number==1)
				{
					System.out.println(number+"is neither prime nor composite");
				}
			else
			{
				if(isPrime(number))
					System.out.println(number+"is a prime number");
				else
					System.out.println(number+"is not a prime number");
					
				}
		}
	
		public static boolean isPrime(int no)
		{
			if(no<0)no*=-1;
				Boolean isPrime=true;
				for(int i=2;i<no/2+1;i++)
				{
					if(no%i==0)
					{
						isPrime=false;
						break;
					}
				}
				if(no==0||no==1)isPrime=false;
				return isPrime;
		}

	}


