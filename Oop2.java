

class students{
    // Scanner s = new Scanner(System.in);

    String subject1;

    String subject2;

    String subject3;

    void details(){

    System.out.format("The subjects are %s, %s, and %s", subject1 , subject2 , subject3);    
}
}

public class Oop2 {
    public static void main(String[] arg){

    students Batman = new students();

    Batman.subject1 = "English";
    Batman.subject2 = "Math";
    Batman.subject3 = "History";
    Batman.details();
    }
}
