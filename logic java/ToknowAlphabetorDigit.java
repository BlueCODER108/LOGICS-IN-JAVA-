import java.util.Scanner;
class ToknowAlphabetorDigit
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character");
		char ch= sc.next().charAt(0);
		if (ch>='A' && ch<='Z'|| ch>='a' && ch<='z' || ch>='0' && ch<='9')
		{
           System.out.println(" Is a alphabet or digit");
		}
		else
			System.out.println("Not a alphaet or figit");
	}
}
