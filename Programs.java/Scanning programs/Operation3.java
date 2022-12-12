import java.util.Scanner;
class Operation3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rate for dozen bananas: ");
		Double rate= sc.nextDouble();
		System.out.println("Enter the no of bananas you want to buy: ");
		Double b= sc.nextDouble();
		Double quantity= (b/12);
		Double Totalcost = quantity * rate;
		
		System.out.println("The total cost is : " + Totalcost);

	}
}
