public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //strings
        //substring

        String name1 = "Arjun and Krishna";
        String name2 = "  in  mahabharat";
        String name3 = name1+name2;
        System.out.println(name1.substring(0,5));
        System.out.println(name1.length());
        System.out.println(name1.replace('a','n'));
        System.out.println(name1.charAt(0));
        System.out.println(name3);


    }
}