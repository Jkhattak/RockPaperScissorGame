public class ArrayLenght {
    public static void main(String[] arg){
        
        // int [] marks = new int [5];
        
        // float [] numbers = new float[4];
        float [] numbers = {14.3f, 15.5f , 16.0f , 16.5f};

        // System.out.println(numbers.length);
        // System.out.println(("The size of the array is ") + numbers.length);

        // System.out.println("Printing using for loop");

        // for (int i =0; i<numbers.length; i++ ){
        //     System.out.println(numbers[i]);
        // }

        // System.out.println("Print aray in reverse order");
        // for (int i=numbers.length - 1; i>=0; i-- ){
        //     System.out.println(numbers[i]);
        // }
        
        
        int [] marks = {1,2,3,5};
        for (int element: marks){
            System.out.println(element);
        }

    }
}
