import java.util.Scanner;
class CHeckEligibleFOrVotingorNOT
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age of the Person: ");
		double a= sc.nextDouble();

		if (a >= 18)
		  System.out.println("The Person Is Eligible To VOTE");
		else
			System.out.println("The Person Is NOT Eligible To VOTE");
	}
}
