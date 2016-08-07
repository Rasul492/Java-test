package test.progs2;
import java.util.Scanner;

public class Loga {
	
	public static double getLoga (double a, double b)
	{
	    return Math.log(a)/Math.log(b);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();		
		b = sc.nextInt();
		sc.close();
		System.out.println(getLoga(a,b));

	}

}
