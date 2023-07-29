import java.util.Scanner;

public class integer {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a % 2 ==0){
            System.out.println("NUmber is integer");
        } else{
            System.out.println("Number is not an integer");
        }
    }
}
