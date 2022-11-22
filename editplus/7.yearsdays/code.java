import java.util.Scanner;

class code
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");

        int days, years, weeks;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter days : ");
        days = scan.nextInt();
        years = (days / 365);
        weeks = (days % 365) / 7;
        days  = days - ((years * 365) + (weeks * 7));
        System.out.println("Years : " + years);
        System.out.println("Weeks : " + weeks);
        System.out.println("Days : " + days);
    }
}