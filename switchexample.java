import java.util.Scanner;

public class switchexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are 18 years old");
                break;
            case 21:
                System.out.println("You are 21 years old");
                break;
            default:
                System.out.println("You are too young or too old ");
                break;
        } {

        }
    }
}
