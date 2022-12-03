import java.util.Scanner;
class UppercaseToLowercase
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a uppercase character");
		char ch= sc.next().charAt(0);
		int ascii= ch;
		ascii= ascii +32;
		ch= (char)ascii;
		System.out.println(ch);
	}
}
