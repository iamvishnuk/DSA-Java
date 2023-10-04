import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);

        // type casting
        int num = (int)(67.56f); // explicitly casting to the integer type
        System.out.println(num);

        // automatic type promotion in expression
        int a = 257;
        byte b = (byte)(a); // the byte size is 256 => output => 257 % 256 = 1

        int number = 'A';
        System.out.println(number); // it will convert the letter to the ASCII representation automatically
    }
}
