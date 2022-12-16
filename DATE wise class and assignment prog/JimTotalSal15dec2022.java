import java.util.Scanner;

class JimTotalSal15dec2022
{
	public static void main(String[] args) 
	{
		Double foodExp, travelExp, savings;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Salary of Karen:");
		Double sal= s.nextDouble();
		System.out.println("Enter the Number of days jim goes :");
		int days = s.nextInt();

		if(sal>9000){
			System.out.println("INVALID INPUT");

			if (days<3)
			      System.out.println("INVALID INPUT");
			else
				  System.out.println("THANK YOU FOR ENTERING THE DAYS");

		}
		else{
			System.out.println("THANK YOU FOR ENTERING THE SALARY");
		foodExp = sal * (50 /100);
		travelExp = sal * (20 /100);

		if (days<=30)
		{
			savings = sal - foodExp- travelExp;
			System.out.println("The Savings of jim are Rs:  "+ savings);

		}
		else if(days == 31){

			savings = sal + 500 - foodExp - travelExp;
			System.out.println("The Savings of JIM are Rs:  "+ savings);

		}

		}


	}
}
