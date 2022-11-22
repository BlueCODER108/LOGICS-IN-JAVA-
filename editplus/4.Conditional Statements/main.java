import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter if sun is up or not in boolean form : ");
        boolean isSunUp = sc.nextBoolean();
        new Scanner(System.in);
        System.out.println(" Enter your age: ");
        int age = sc.nextInt();
        if (isSunUp) {
            System.out.println("day");
        } else {
            System.out.println("night");
        }

        if (age > 18) {
            System.out.println("Your are ready to vote");
        } else {
            System.out.println("Your are not ready to vote");
        }

    }
}