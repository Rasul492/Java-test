package test.progs2;
import java.util.Scanner;


public class Mysterio {
	
	public static void entrance()
	{
	
	     System.out.println("Hello! This is Mysterious Game.");
	     System.out.println();  
	     System.out.println("Mysterious number from 1 to 100 is generated. Try to guess it.");
	     System.out.println("Let us begin. First of all input the names of players.");
	     System.out.println();     
	     
	     return;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
    
	 int a;
	 a=(int) (Math.random()*10+1);
	 entrance();
		
	 String sa [];
	 sa = new String[2];
	 
     Scanner sc = new Scanner(System.in);	
	 System.out.print("Please enter 1st player's name: ");
	 sa[0] = sc.nextLine();
	 System.out.print("Please enter 2nd player's name: ");
	 sa[1] = sc.nextLine();
	 System.out.println();
	 System.out.println("Now type the hidden number.");
	 int b, k=0;
	 
	 do
	 {
		 System.out.print(sa[k]+"'s turn: ");
		 b= sc.nextInt();
		 
		 if (b>a)
		 {
			 System.out.println(b +" is GREATER"+'\n');
		 }
		 if (b<a)
		 {
			 System.out.println(b+" is LOWER"+'\n');
		 }
		 if (b==a)
		 {
			 System.out.println(sa[k]+ " won! Congratulations!");
		 }
		 
		 if (k==0)
		 {
			 k=1;
		 }
		 else 
		 {
			 k=0;
		 }
			 
	 }
	 while (b!=a);
	 
	
	 
	 
	 sc.close();	 

    
     
     
     System.out.println("The mysterious number is "+ a);
	}

}
