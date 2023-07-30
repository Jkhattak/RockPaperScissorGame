class Car{
    int year;
    String model;
    String color;
    int mileage;
}


public class Vechical {
 
public static void main(String args[]){

    Car car1 = new Car();
    car1.model = "Tesla";
    car1.year = 2021;
    car1.color = "Red";
    car1.mileage = 20;

    System.out.println("The mode of the car is " +  car1.model + ". The year of car is " + car1.year + ". The color of the car is " + car1.color + ", and the mileage on the car is " + car1.mileage + " miles");
}    

}
