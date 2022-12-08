import java.util.Scanner;
class CHeckcharacterisALPHABETorNot
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character:  ");
		char a = sc.next().charAt(0);

		if (a >='A' && a >= 'Z'|| a >='a' && a >= 'z')
		  System.out.println("The Character is ALPHABET");
		else
		   System.out.println("The Character is NOT ALPHABET");
	}
}
