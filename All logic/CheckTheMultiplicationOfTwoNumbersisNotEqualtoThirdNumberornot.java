import java.util.Scanner;
class CheckTheMultiplicationOfTwoNumbersisNotEqualtoThirdNumberornot
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

		if ((a * b) !=c)
		  System.out.println("The Multiplication of the two numbers is NOT Equal to third number");
		else
			System.out.println("The Multiplication of the two numbers is EQUAL to third number");
	}
}
