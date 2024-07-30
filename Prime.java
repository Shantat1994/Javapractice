package GenericPrograms;

public class Prime {

	public static void main(String[] args) {
		
		int a= 97;
		int count=0;
		for (int i=2;i<a;i++)
		{
		  if (a%i==0)
		  {
			  count++;
		  }
			
		}
		
		if(count>0)
		{
			System.out.println("not a prime no");
			
		}
		
		else
		{
			System.out.println("prime no");
		}
		

	}

}
