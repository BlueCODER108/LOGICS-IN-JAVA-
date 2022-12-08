import java.util.Scanner;
class CheckSumOftheTwoNumbersEqualtoTenOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double a= sc.nextDouble();

		System.out.println("Enter a number: ");
		double b = sc.nextDouble();

		if (a + b == 10)
		  System.out.println("Sum Of the Two Numbers Equal to 10");
		else
			System.out.println("Sum Of the Two Numbers NOT Equal to 10");
	}
}
