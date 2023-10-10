public class MaxItem {
    public static void main(String[] args) {
        int[] arr = {34, 45, 62, 66, 234};
        System.out.println("max:" + max(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
