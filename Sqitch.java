import java.util.Scanner;

public class Sqitch {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        switch (a){

            case 1:System.out.println("Hello");
            break;
            case 2: System.out.println("Hi");
            break;
            case 3 :System.out.println("Bye");
            break;
            default: System.out.println("End");
        }



    }
}
