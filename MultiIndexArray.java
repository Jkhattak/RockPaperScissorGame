public class MultiIndexArray{
    public static void main (String[] arg){


    int [] [] number = new int [2][3];

    number[1][0]=15;
    number[1][1]=30;
    number[1][2]=45;

    number[0][0]=50;
    number[0][1]=60;
    number[0][2]=70;

    
    // System.out.println(number[1][0]);
    for (int i=0; i<number.length; i++){
        for (int j=0; j<number[i].length; j++){

                    System.out.println(number[i][j]);
                    System.out.println("");

        }
    }    
    }
}