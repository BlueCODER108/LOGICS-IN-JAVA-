import java.util.Scanner;
class CHeckThestudentPassesInallSubjectornot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a PassValue:  ");
		double passvalue = sc.nextDouble();

		System.out.println("Enter Marks Attained in Subject 1:  ");
		double S1 = sc.nextDouble();

		System.out.println("Enter Marks Attained in Subject 2:  ");
		double S2 = sc.nextDouble();

		System.out.println("Enter Marks Attained in Subject 3:  ");
		double S3 = sc.nextDouble();

		System.out.println("Enter Marks Attained in Subject 4:  ");
		double S4 = sc.nextDouble();

		System.out.println("Enter Marks Attained in Subject 5:  ");
		double S5 = sc.nextDouble();

		if (S1 >= passvalue && S2 >= passvalue && S3 >= passvalue && S4 >= passvalue && S5 >= passvalue)
		  System.out.println("The STUDENT PASSED IN ALL SUBJECTS");
		else
		   System.out.println("The STUDENT DIDN'T PASS IN ALL SUBJECTS");
	}
}
