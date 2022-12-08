import java.util.Scanner;
class CheckTwoNumbersEqualOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double a = sc.nextDouble();

		System.out.println("Enter a number: ");
		double b = sc.nextDouble();

		if (a==b)
		  System.out.println("The two numbers are equal");
		else
			System.out.println("The two numbers are not equal");
	}
}
