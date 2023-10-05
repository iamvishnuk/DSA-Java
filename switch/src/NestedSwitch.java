import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String deparment = in.next();
        // new enhanced switch
        // => each line as default break
        // => much cleaner syntax
        switch (empID) {
            case 1 -> System.out.println("Vishnu K");
            case 2 -> System.out.println("Pravav");
            case 3 -> {
                switch (deparment) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No Department found");
                }
            }
            default -> System.out.println("Enter valid EmpID");
        }
    }
}
