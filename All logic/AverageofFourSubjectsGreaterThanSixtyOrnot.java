import java.util.Scanner;
class AverageofFourSubjectsGreaterThanSixtyOrnot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double a= sc.nextDouble();

		System.out.println("Enter a number: ");
		double b= sc.nextDouble();

		System.out.println("Enter a number: ");
		double c= sc.nextDouble();

		System.out.println("Enter a number: ");
		double d= sc.nextDouble();

		if ((a + b + c + d)/4 > 60)
		  System.out.println("Average of four subject marks > 60");
		else
			System.out.println("Average of four subject marks is !> 60");
	}
}
