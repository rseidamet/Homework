import java.util.Scanner;

public class FunctionCalculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter x:");
        double x = input.nextDouble();
        System.out.println("f(x) = "+ Math.log( Math.sin ( x) + (Math.pow(Math.E,x)*(Math.sqrt(x)/ Math.PI) )));

    }
}
