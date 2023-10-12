public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,1};
        int target = 3;
        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBinarySearch(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        } else {
            return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
        }
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                // you are in the desc part of the array
                end = mid;
            } else {
                // you are in the asce part of the array
                start = mid + 1;
            }
        }
        // in the end start == end and both are pointing toward the largest number
        // start and end always trying to find the max element in the above checking.
        return start; // use can return start or end both are equal
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        // find whether the array is sorted in ascending or descending order
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if( arr[mid] == target) {
                return mid; // answer found
            }
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

}
