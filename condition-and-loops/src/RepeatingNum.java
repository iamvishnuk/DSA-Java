import java.util.Scanner;

public class RepeatingNum {
    public static void main(String[] args) {
        int n = 242399232;
        int t = 2;
        int count = 0;

        while (n > 0) {
            int rem = n % 10;
            if( rem == t) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}
