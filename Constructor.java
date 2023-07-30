class Base1{
    int a=10;

    Base1(){
        System.out.println("I am a constructor");
    }
}

class Dervied extends Base1{
    
}

public class Constructor {
    public static void main (String args []){
        Base1 box = new Base1();
    }
    
}
