package test.progs2;

import java.util.Scanner;

public class simpleDividers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		int i =2;
		
		while (a>1)
		{
			if (a % i==0)
			{
				System.out.print(i+" ");
				a/=i;
			}
			else
			{
				i++;
			}
		}
		sc.close();

	}

}
