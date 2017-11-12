import java.util.Scanner;

public class SimpleAboutMeApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.next();
        System.out.println("Enter your surname:");
        String surname = input.next();
        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("I'm "+ name +" "+ surname + ", "+ age + " years old.");
    }
}
