import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(-31);
        System.out.println(-72);
        System.out.println(-57);
        System.out.println(56);
        System.out.println(true);
        System.out.println(false);
        System.out.println(false);
        int c = 5;
        int d = 6;
        c += d;
        d -= c;
        System.out.println("value of c is: " + c + "  value of d is : " + d);
        int e = 23;
        int f = e - 12 - 30 + 7 - 12 + 7;
        e += f;
        f -= e * 3 / 2;
        e = e * 7 / -2 + 5;
        f -= 5;
        System.out.println("value of e is: " + e + "  value of f is : " + f);
        System.out.println(-26);
        System.out.println("sum is 23");
        System.out.println("sum is 5");
        System.out.println("output is 23.5");
        System.out.println("output is: false");
        System.out.println("2 2");
        System.out.println(" one of the statements is false or both are false");
        int a = -1;
        System.out.println(a);
        Boolean b = false;
        System.out.println(b);
        float x = 8.0F;
        System.out.println(x);
        Scanner cv = new Scanner(System.in);
        System.out.println("Enter the total number of items: ");
        int items = cv.nextInt();
        Scanner bv = new Scanner(System.in);
        System.out.println("Enter the total amount of bill: ");
        float bill = bv.nextFloat();
        if (items < 5 && !(bill >= 8000.0F)) {
            System.out.println("Your totalbill is:  " + bill);
        } else {
            System.out.println("CONGRATULATIONS !!! You got a discount of 20%");
            float discountamount = bill * 20.0F / 100.0F;
            float totalbill = bill - discountamount;
            System.out.println(" Your total bill is: " + totalbill + " rupees only");
        }

    }
}
