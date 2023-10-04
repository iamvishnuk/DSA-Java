import java.util.Scanner;

public class NumberAndOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter number 1 :");
        int num1 = input.nextInt();

        System.out.println("enter number 2 :");
        int num2 = input.nextInt();

        System.out.println("enter the operator (+, -, * , /)");
        char operator = input.next().charAt(0);

        if (operator == '+') {
            int result = num1 + num2;
            System.out.println("Sum of 2 numbers is:" + result);
        }

        if (operator == '-') {
            int result = num1 - num2;
            System.out.println("Subtract from 2 numbers is:" + result);
        }

        if (operator == '*') {
            int result = num1 * num2;
            System.out.println("Multiplication of 2 number is:" + result);
        }

        if (operator == '/') {
            float result = num1 / num2;
            System.out.println("Divison of 2 number is:" + result);
        }
    }
}
