package Flow_Control;

public class Primernot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=3;
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
		if(isPrime)System.out.println("prime");
		else System.out.println("not prime");

	}

}
