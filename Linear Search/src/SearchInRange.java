public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 23};
        int target = 23;
        int ans = linearSearch(nums, target, 1, 5);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) return -1;

        for (int i = start; i < end; i++) {
            int element = arr[i];
            if(element == target) return i;
        }
        return -1;
    }
}
