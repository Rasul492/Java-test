package test.progs2;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) 
	{
		
		int[] A;
		A= new int[4];
		Scanner sc = new Scanner(System.in);	
		for (int i=0; i<4; i++)
		{
			A[i]=sc.nextInt();
		}
		
		sc.close();
		
		int max=A[0];
		
		for (int i=1; i<4; i++)
		{
			if (max < A[i])
					{
				      max=A[i];
					}
			
					
		}
		System.out.println(max);
		
		
		
		
		
			
		
	}

}
