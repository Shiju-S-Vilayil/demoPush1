package basica;

public class Sample
{
	public static void main(String[] args) 
	{
		System.out.println("Hello world");
		Sample a1=new Sample();  //  creating object
		a1.d();
		a1.data();   //calling method data using object
	
	}
	void d()
	{
		
		System.out.println("D METHOD IS WORKING");
	
		
	}
	void data()
	{
		
		System.out.println("DATA METHOD IS WORKING");
	}

}
