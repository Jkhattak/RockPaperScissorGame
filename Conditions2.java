import java.util.Scanner;

public class Conditions2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        // int c = sc.nextInt();

        if (a == b){
            System.out.println("A equal B");
        }else if (a < b){
            System.out.println("A is less than B");
        } else {
            System.out.print("A is greater than B");
        }
    }
}
