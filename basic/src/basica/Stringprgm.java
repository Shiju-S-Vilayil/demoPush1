package basica;

public class Stringprgm 
{
	public static void main(String[] args) 
	{  int count=0,k=0,temp=0;
		int a[]=new int[100];
		String value="010000001000001000100010000";
		char charArray[]=value.toCharArray();
		for(int i=0;i<charArray.length;i++)
		{
			if(charArray[i]=='0')
			{
				count++;	
			}
			else
			{
				a[k]=count;
				count=0;
			}
			a[k]=count;
			k++;
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
			System.out.println("Highest Range-"+a[0]);
			
		
		
	}

}
