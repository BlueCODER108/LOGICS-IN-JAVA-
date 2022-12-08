import java.util.Scanner;
class CHeckFirstNumisGreaterThanSecondandThirdornot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number ");
		double a= sc.nextDouble();

		System.out.println("Enter the Second Number: ");
		double b= sc.nextDouble();

		System.out.println("Enter the Third Number: ");
		double c= sc.nextDouble();

		if (a > b && a > c)
		  System.out.println("The First Number is GREATER than Both Second and third");
		else
		   System.out.println("The First Number is NOT GREATER than Both Second and third");
	}
}
