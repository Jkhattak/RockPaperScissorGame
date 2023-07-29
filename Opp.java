
class Employee{
    int id;
    String  name;

    void printDetails(){
        System.out.println("The ID is "+ id);
        System.out.println("The name is "+ name);
    }
};

class Subject{
    String subject;
    int numbers;

    void details(){
        System.out.println("The subject is "+subject);
        System.out.println("The number is "+ numbers);
    }

}
public class Opp {

    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee Batman = new Employee();
        Batman.name = "Batman";
        Batman.id = 007;

        Subject Superman = new Subject();

        System.out.println("Superman favourite subject and marks are :");  

        Superman.subject = "English";
        Superman.numbers = 99;

        Superman.details();


        

    }

    
}