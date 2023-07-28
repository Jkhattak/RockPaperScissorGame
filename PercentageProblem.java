import java.util.Scanner;

public class PercentageProblem {
    public static void main(String[] arg){
        // we need to calculate percentage of student total marks
        //student is enrolled in five subjects

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number for subject 1");
        float sub1 = sc.nextFloat();

        System.out.println("Enter number for subject 2");
        float sub2 = sc.nextFloat();

        System.out.println("Enter number for subject 3");
        float sub3 = sc.nextFloat();

        System.out.println("Enter number for subject 4");
        float sub4 = sc.nextFloat();

        System.out.println("Enter number for subject 5");
        float sub5 = sc.nextFloat();

        // since I need to find percentage of the total, I need to add first and then 
        // divide by total number of subjects
        System.out.println("The percentage is : ");
        System.out.println((sub1 + sub2 + sub3 + sub4 + sub5) / 5);
    }
}
