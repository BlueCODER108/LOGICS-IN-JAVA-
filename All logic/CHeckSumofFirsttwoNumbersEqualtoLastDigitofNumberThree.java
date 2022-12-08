import java.util.Scanner;
class CHeckSumofFirsttwoNumbersEqualtoLastDigitofNumberThree
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double a= sc.nextDouble();

		System.out.println("Enter a number: ");
		double b= sc.nextDouble();

		System.out.println("Enter a number: ");
		double c= sc.nextDouble();

		if ((a + b)==c%10)
		  System.out.println("Sum of the two first Numbers is Equal to the Last Digit of the Third Number");
		else
			System.out.println("Sum of the two first Numbers is NOT Equal to the Last Digit of the Third Number");
	}
}
