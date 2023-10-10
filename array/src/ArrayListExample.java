import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array list => dynamic array
        ArrayList<Integer> list = new ArrayList<>(10);

        /*
        * size is fixed internally
        * array list fill by some amount of data
        * it will create new array list of double the size
        * old elements are copied in the new list
        * */

        // adding new element
        list.add(23);
        list.add(2233);
        list.add(233);

        // updating list.set(index, newElement)
        list.set(0, 123);

        //remove list.remove(index)
        list.remove(2);

        // input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

    }
}
