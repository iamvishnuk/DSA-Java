import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0, b = 1;
        int c = 2;

        if(n == 0) {
            System.out.println(a);
        }

        while(c <= n) {
            int temp = b;
            b = a + b;
            a = temp;
            c++;
        }

        System.out.println(b);
    }
}
