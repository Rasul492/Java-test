package test.progs2;

public class Happy {
	public static boolean isHappy (int a)
	{
		int b=1;
		for (double i=2; i<=a/2; i++)
		{
		  if (a % i == 0)
		  {
			  b+=i;
		  }
		}
		
		if (b==a)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		for (int i=1; i<=10000; i++)
				{
			       if (isHappy(i))
			      {
				    System.out.println(i);
			      }
		
				}
	
		
	}

}
