import java.util.Scanner;
class CHeckIfNumisDivisiblebyBoth3and5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:  ");
		double a= sc.nextDouble();

		if (a % 3 == 0 && a % 5 ==0)
		  System.out.println("The Given Number is divisible by both 3 and 5");
		else
		   System.out.println("The Given Number is NOT divisible by both 3 and 5");
	}
}
