import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hello " + name + ", nice to see you!");

        System.out.println("What is your favorite color?");
        String color = scan.next();
        System.out.println("Oh I like " + color + " too!");

        System.out.println("What is your favorite number?");
        String num = scan.next();
        int num1 = Integer.parseInt(num);
        System.out.println("Got it. My favoite number is " + (num1 + 1) + "!");

        System.out.println("What is your favorite subject?");
        String subject = scan.next();
        System.out.println("Yes, " + subject + " is interesting.");

        System.out.println("What is your favorite food?");
        String food = scan.next();
        System.out.println("Yes, I like " + food + " too!");

        scan.close();
    }
}
