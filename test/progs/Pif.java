package test.progs;
import java.util.Scanner;
public class Pif {


	public static void  main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int a =0,b=0, p,s;
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("a=");		
		if ( sc.hasNextInt() )
		a = sc.nextInt();
		else
		{
			System.out.println("Error");
			sc.close();
			return;
		}
		
		System.out.print("b=");	
		if ( sc.hasNextInt() )
		b = sc.nextInt();
		else
		{
			System.out.println("Error");
			sc.close();
			return;
		}
		
		p=2*(a+b);
		s=a*b;
		System.out.println("P="+p+'\t'+"S="+s);
		
		sc.close();
		
	
		

	
		
		
		
	





	}

}
