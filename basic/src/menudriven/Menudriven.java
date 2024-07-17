package menudriven;

import java.util.Scanner;

public class Menudriven 
{
	
	Scanner sc=new Scanner(System.in);

	
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		Menudriven m=new Menudriven();
		System.out.println("1:Add");
		System.out.println("2:Multiply");
		System.out.println("Please enter the option");
		int choice=input.nextInt();
		switch(choice)
		{
		case 1:
			m.addNumber();
			break;
			
		case 2:
			m.multiplyNumber();
			break;	
		default :
			System.out.println("Invalid Choice");
				break;
		}
		
	}
	
	void addNumber()
	{
		System.out.println("Please enter the numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println(a+b);
	}
	void multiplyNumber()
	{

		System.out.println("Please enter the numbers");
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		System.out.println(a1*b1);
	
	}


}
