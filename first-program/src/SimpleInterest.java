import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Simple Interest calculator");

        System.out.println("Please enter the principal amount");
        float P = input.nextFloat();

        System.out.println("Please enter the Time period");
        int T = input.nextInt();

        System.out.println("Please enter the Rate of interest");
        float R = input.nextFloat();

        float SI = (P * T * R) / 100;

        System.out.println("Simple Interest is =>" + SI);
    }
}
