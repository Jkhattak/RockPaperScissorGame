import java.util.Scanner;

/**
 * DoubleMatrix
 */
public class DoubleMatrix {

    public static void main (String args []){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int rows [][] = new int[a][b];


        //input 

        for (int i=0; i<a; i++){
            for (int j=0; j<b; j++){
                rows[i][j] = sc.nextInt();
            }
        }

        //out

        for (int i=0; i<a;i++){
            for (int j=0; j<b; j++){
                if (rows[i][j] == 5){
                    System.out.println(i + "  " + j);
                }
                
            }
        }
    }
}