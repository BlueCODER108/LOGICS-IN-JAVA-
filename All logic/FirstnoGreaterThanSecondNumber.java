import java.util.Scanner;
class FirstnoGreaterThanSecondNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double a= sc.nextDouble();

		System.out.println("Enter a number: ");
		double b = sc.nextDouble();

		if (a>b)
		  System.out.println("The first Number is greater than the second ");
		else
			System.out.println("The first Number is NOT greater than the second");
	}
}
