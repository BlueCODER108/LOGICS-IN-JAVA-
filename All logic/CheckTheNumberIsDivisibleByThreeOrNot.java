import java.util.Scanner;
class CheckTheNumberIsDivisibleByThreeOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double a= sc.nextDouble();

		if (a % 3 ==0)
		  System.out.println("The Given Number is DIVISIBLE by 3");
		else
			System.out.println("The Given Number is NOT DIVISIBLE by 3");
	}
}
