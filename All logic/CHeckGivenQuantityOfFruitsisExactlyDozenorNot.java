import java.util.Scanner;
class CHeckGivenQuantityOfFruitsisExactlyDozenorNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double a= sc.nextDouble();

		if (a % 12 == 0)
		  System.out.println("The Given Quantity of fruits is equal to DOZENS");
		else
			System.out.println("The Given Quantity of fruits is NOT equal to DOZENS");
	}
}
