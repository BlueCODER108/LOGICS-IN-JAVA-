import java.util.Scanner;

class JimTotalSal14dec2022
{
	public static void main(String[] args) 
	{
		Double foodExp, travelExp, savings;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Salary of Karen:");
		Double sal= s.nextDouble();
		System.out.println("Enter the Number shifts of Karen:");
		int shiftno = s.nextInt();

		if(sal>8000){
			System.out.println("Salary too large");

			if (shiftno<0)
			      System.out.println("Shifts too small");
			else
				  System.out.println("THANK YOU FOR ENTERING THE SHIFTS");

		}
		else{
			System.out.println("THANK YOU FOR ENTERING THE SALARY");
		foodExp = sal * (20 /100);
		travelExp = sal * (30 /100);

		if (shiftno>0)
		{
			Double shift = shiftno * (sal * 2 /100);
			savings = sal + shift - foodExp - travelExp;
			System.out.println("The Savings of karen are Rs:  "+ savings);

		}
		else {

			savings = sal - foodExp - travelExp;
			System.out.println("The Savings of karen are Rs:  "+ savings);

		}

		}


	}
}
