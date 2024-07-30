package GenericPrograms;

public class LeapYearCheck {

	public static void main(String[] args) {
		int year=2020;
		Boolean status = null;
		if ((year%400==0)||(year%100!=0)&&(year%4==0))
		{
			status=true;
		}
		else
		{
			status=false;
		}
		
		if (status)
		{
			System.out.println("Leap Year");
			
		}
		else
		{
			System.out.println("Not a Leap Year");
		}

	}

}
