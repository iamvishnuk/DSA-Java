import java.util.Scanner;

public class USDConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the rupees:");
        float rupees = input.nextFloat();

        double USD = rupees * 0.012;

        System.out.println("USD => " + USD);

    }
}
