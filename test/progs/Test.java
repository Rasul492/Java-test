package test.progs;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       
		int a =0,b=0, c=0;
		
		
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("a=");		
		if ( sc.hasNextInt() )
		a = sc.nextInt();
		else
		{
			System.out.println("Error");
			sc.close();
			return;
		}
		
		System.out.println("b=");	
		if ( sc.hasNextInt() )
		b = sc.nextInt();
		else
		{
			System.out.println("Error");
			sc.close();
			return;
		}
		
		
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("a="+a+" b="+b);	

       
		sc.close();

		
		

	}

}
