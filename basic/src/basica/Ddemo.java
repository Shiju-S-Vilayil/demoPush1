package basica;

import java.util.Scanner;

public class Ddemo 
{

	 void createMultiplicationTable(int x)
	{
		int i=1;
		while(i<13)
		{
			System.out.println(i+" * "+x+"  ="+(i*x));
			i++;
		}
	}
	 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the Number for Multiplication table");
		int n=sc.nextInt();
		Ddemo obj=new Ddemo();
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			obj.createMultiplicationTable(rem);
			n=n/10;
		}
	
		
	}
	 
	 
	 
}
