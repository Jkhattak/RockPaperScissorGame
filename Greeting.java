import java.util.Scanner;

public class Greeting {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        System.out.println(String.format("Hello %s. Welcome to the club ",name, arg));

    }
}
