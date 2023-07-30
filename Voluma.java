class Volume{
    int height;
    int width;
    int depth;

    void volumne(){
    System.out.println("The volume is ");
    System.out.println(height * width * depth);
}
}

public class Voluma {
    public static void main(String args[]){

        Volume box1 = new Volume();
        Volume box2 = new Volume();

        box1.height = 5;
        box1.width = 5;
        box1.depth = 5;

        box2.height = 3;
        box2.width = 6;
        box2.depth = 9;

        box1.volumne();
        box2.volumne();
        

    }
}
