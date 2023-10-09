import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.next();
        String sample = myGreeting(name);
        System.out.println(sample);
    }

    static String myGreeting(String name) {
        String message = "Hello " + name;
        return message;
    }
}
