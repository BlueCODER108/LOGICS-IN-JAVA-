import java.util.Scanner;
class CHeckIfNumisinBETWEEN30and50OrNOT
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:  ");
		double a= sc.nextDouble();

		if (a>=30 && a<=50)
		  System.out.println("The Given Number is IN BETWEEN 30 and 50 ");
		else
		   System.out.println("The Given Number is NOT IN BETWEEN 30 and 50 ");
	}
}
