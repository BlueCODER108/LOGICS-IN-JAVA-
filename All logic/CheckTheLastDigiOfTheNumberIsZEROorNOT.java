import java.util.Scanner;
class CheckTheLastDigiOfTheNumberIsZEROorNOT
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double a= sc.nextDouble();

		if (a % 10 ==0)
		  System.out.println("The Given Number, last Digit is 0");
		else
			System.out.println("The Given Number, last Digit is NOT 0");
	}
}
