import java.util.Scanner;

/**
 * ArraySearch
 */
public class ArraySearch {

    public static void main (String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to create an array : ");
        int number = s.nextInt();

        System.out.println("Enter the value for x :");
        int x = s.nextInt();

        //input
        int [] arrayNumber  = new int [number];
        for (int i=0; i<number; i++){
            arrayNumber[i] = s.nextInt();
        };
        
        
        //output
        for (int i=0; i<arrayNumber.length; i++){
            if(arrayNumber[i] == x){
                System.out.println("Index is : ");

                System.out.println(i);
            }
        }
    }
}