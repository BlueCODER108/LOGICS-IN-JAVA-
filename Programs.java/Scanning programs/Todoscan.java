import java.util.Scanner;
class Todoscan 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("The a Value: ");
		int a= sc.nextInt();
		int b= a%10;
		System.out.println("The last digit of the value is: " + b);
	}
}
