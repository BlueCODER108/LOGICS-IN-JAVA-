import java.util.Scanner;
class CHECKanytwoNumbersareEqualIn3NUmbs
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

		if (a==b || b==c || c ==a)
		  System.out.println("ANY TWO NUMBERS ARE EQUAL");
		else
			System.out.println("ANY TWO NUMBERS ARE NOT EQUAL");
	}
}
