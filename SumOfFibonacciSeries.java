package GenericPrograms;

public class SumOfFibonacciSeries {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int sum=0;
		
		while(sum<76)
		{
			sum=a+b;
			a=b;
			b=sum;
		}
		
		System.out.println(sum);

	}

}
