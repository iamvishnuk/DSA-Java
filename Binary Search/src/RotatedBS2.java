public class RotatedBS2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 4;
        System.out.println(search(arr, target));

    }
    static boolean search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // if you did not find the pivot, it means that the array is not rotated
        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        // if pivot is found,
        if (nums[pivot] == target) {
            return true;
        }
        boolean firstHalf = binarySearch(nums, target, 0, pivot);
        if (firstHalf) {
            return true;
        } else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }

    }

    static boolean binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceeds the limit of integers
            int mid = start + (end - start) / 2;
            if( arr[mid] == target) {
                return true; // answer found
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            }
        }
        return false;
    }
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid; // find the pivot
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
