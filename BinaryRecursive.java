class BinaryRecursive{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int target = 50;
        int low = 0;
        int high = arr.length - 1;

        int result = BinarySearch(arr, low, high, target);

        if (result == -1){
            System.out.println("Invalid target");
        }else{
            System.out.println("Index of target = " + result);
        }
    }
    public static int BinarySearch(int[] arr, int low, int high, int target){
        if (low > high){
            return -1;
        }

        int mid = low + (high - low)/2;

        if (arr[mid] == target){
            return mid;
        }
        if (arr[mid] < target){
            return BinarySearch(arr, mid + 1, high, target);
        }
        
        return BinarySearch(arr, low, mid - 1, target);
    }
}