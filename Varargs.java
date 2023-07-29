public class Varargs {

    // static int sum(int a, int b){
    //     int s;
    //     s = a +b;
    //     return s;
    // }
    
    static int sum(int ...arr){
        int result = 0;

        for (int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] arg){
        System.out.println("Welcome to the club");
        System.out.println(sum(5, 6));
        System.out.println(sum(15,30,50,60,111));
    }
}
