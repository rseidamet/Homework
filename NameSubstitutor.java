import java.util.Scanner;

public class NameSubstitutor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter message:");
        String massage = input.nextLine();
        System.out.println("Enter name:");
        String name = input.nextLine();
        System.out.println(massage.replace("${name}",name));
    }
}
