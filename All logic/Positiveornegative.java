import java.util.Scanner;
class Positiveornegative
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double a = sc.nextDouble();
		if (a>0)
		  System.out.println("The number is positive");
		else
			System.out.println("The number is negative");
	}
}
