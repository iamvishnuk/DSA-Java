public class SearchInStrings {
    public static void main(String[] args) {
        String name = "vishnu";
        char target = 'v';
        System.out.println(search(name, target));
    }

    static boolean search(String name, char target) {
        if(name.length() == 0) return false;
        for(int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i)) return true;
        }
        return false;
    }

    // using enhanced for loop
    static boolean search2(String name, char target) {
        if (name.length() == 0) return false;

        for (char ch : name.toCharArray()) { // covert the string to char array
            if (ch == target) return true;
        }
        return false;
    }
}
