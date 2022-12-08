import java.util.Scanner;
class CheckTheNumberIsEvenOrNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double a= sc.nextDouble();

		if (a % 2 ==0)
		  System.out.println("The Given Number is EVEN");
		else
			System.out.println("The Given Number is NOT EVEN or ODD NUMBER");
	}
}
