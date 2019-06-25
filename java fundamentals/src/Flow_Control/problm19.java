package Flow_Control;

public class problm19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int counter=0;
		int i=0;
		while(counter!=5)
		{
			i++;
			if(i%2==0&&i%3==0&&i%5==0)
			{
				System.out.println(i);
				counter++;
			}
			
		}
		

	}

}
