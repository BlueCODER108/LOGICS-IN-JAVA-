import java.util.Scanner;
class ThreeNumbersEqualornot
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

		if (a==b && b==c && c ==a)
		  System.out.println("ALL THREE NUMBERS ARE EQUAL");
		else
			System.out.println("ALL THREE NUMBERS ARE NOT EQUAL");
	}
}
