package Flow_Control;

public class UppertoLower 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		char ch='C';
		if(Character.isLowerCase(ch))
			System.out.println(ch+"->"+Character.toUpperCase(ch));
		else
			System.out.println(ch+"->"+Character.toLowerCase(ch));
	}

}
