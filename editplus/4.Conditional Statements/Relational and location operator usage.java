public class Good {
    public Good() {
    }

    public static void main(String[] args) {
        int a = 60;
        int b = 40;
        if (a > 50 && b < 50) {
            System.out.println("both less than fifty");
        }

        if (a < 50 || b < 50) {
            System.out.println("atleast one less than fifty");
        }

    }
}