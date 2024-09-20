
import java.util.Scanner;

public class Pupil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Asking for the users name
        System.out.println("Enter your name:");
        String name=sc.next();

        //Asking for your age
        System.out.println("How old are you?");
        int age=sc.nextInt();

        //Asking for the users favourite color
        System.out.println("What is your favorite food?");
        String food=sc.next();

        //Asking for the users best team
        System.out.println("What is your best team?");
        String team=sc.next();

        //print out users information
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your food is " + food);
        System.out.println("Your team is " + team);

        //close the scanner
        sc.close();
    }
}
