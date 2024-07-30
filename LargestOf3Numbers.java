package GenericPrograms;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		int a=4;
		int b=9;
		int c=9;
		
		if(a>b&&a>c)
		{
			System.out.println("a is the Largest Number");
		}
		else if(b>a&&b>c)
		{
			System.out.println("b is the Largest Number");
		}
		
		else if(c>a&&c>b)
		{
			System.out.println("c is the Largest Number");
		}
		
		else
		{
			System.out.println("Two or more numbers are equal");
		}


	}

}
