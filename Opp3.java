class Employee123 {
    int id;
    String name;

    void details() {
        System.out.println("The id is " + id);
        System.out.println("The name: " + name);
    }
}
public class Opp3 {
    public static void main(String[] args) {
        Employee123 Ironman = new Employee123();

        Ironman.name = "Tony Stark";
        Ironman.id = 1;

        Ironman.details();
    }
}
