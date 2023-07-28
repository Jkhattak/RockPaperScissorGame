import java.util.Scanner;

public class RPSGame {
    public static void main (String[] args){
        // rock paper sissor game code 
        // first we need inputs from user

        Scanner sc = new Scanner(System.in);

        System.out.println("User 1: Enter your sign");
        System.out.println("User 2: Enter your sign");

        String user1;
        String user2;

        user1 = sc.nextLine();
        user2 = sc.nextLine();

        String paper = "paper";
        String rock = "rock";
        String scissors = "scissors";
        

        if (user1.equals(paper) && user2.equals(rock)) {
            System.out.println("User 1 won");
        } 
        else if (user1.equals(rock) && user2.equals(paper))
         {
            System.out.println("user 2 won");
        } 
         if (user1.equals(rock) && user2.equals(scissors)) {
            System.out.println("User 1 won");
        } 
        else if (user1.equals(scissors) && user2.equals(rock))
         {
            System.out.println("user 2 won");
        } 
         if (user1.equals(scissors) && user2.equals(paper)) {
            System.out.println("User 1 won");
        } 
        else if (user1.equals(paper) && user2.equals(scissors))
         {
            System.out.println("user 2 won");
        } 
    }
}
