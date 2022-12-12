import java.util.Scanner;
class Operation2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("The a Value: ");
		float a= sc.nextFloat();
		int b= (int)a/100;
		int c= ((int)a%100)/50;
		int d= ((int)a%100-50)/10;
		System.out.println("The Denomination of amount of number of 100's is: " + b);
		System.out.println("The Denomination of amount of number of 50's is: " + c);
		System.out.println("The Denomination of amount of number of 10's is: " + d);
	}
}
