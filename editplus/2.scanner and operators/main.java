import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // random operator
        System.out.println((int)(Math.random()*100));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        System.out.println(age);

        //float values
        Scanner jb = new Scanner(System.in);
        System.out.println("Enter your cash amount money: ");
        float money = jb.nextFloat();
        System.out.println(money);

        //String value scanning

        Scanner cv = new Scanner(System.in);
        System.out.println("Enter Your Comment : ");
        String comment = cv.nextLine();
        System.out.println(comment);





    }
}