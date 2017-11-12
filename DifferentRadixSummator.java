import java.util.Scanner;

public class DifferentRadixSummator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter X in Bin");
        int x = input.nextInt(2);
        System.out.println("Enter Y in Oct");
        int y = input.nextInt(8);
        System.out.println("Enter Z in Hex");
        int z = input.nextInt(16);
        System.out.println(x+y+z);
    }
}
