import java.util.Scanner;

public class FindANumber {
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int [] r = {1,2,3,4,5};

        for (int i = 0; i <=r.length; i++) {
            if (r[i] ==number){
                System.out.println("Number in the array"+ r[i]);
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
