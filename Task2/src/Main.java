import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please type your name");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println(name);
        System.out.println("Please type your age");
        int age = scan.nextInt();
        System.out.println(age);

        int result;
        result = 67 - age;
        System.out.println("You have " + result + " years left until retirement");
    }
}
