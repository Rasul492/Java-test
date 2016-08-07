package test.progs2;
import java.util.Scanner;

public class Divider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc = new Scanner(System.in);
		int a;
		a = sc.nextInt();
		for (int i=2; i<=a/2; i++)
		{
			if (a % i ==0)
			{
				System.out.print(i+" ");
			}
		}
		sc.close();
	}

}
