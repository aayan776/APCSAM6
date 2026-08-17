class Binary_Sorting{
    public static void main(String[] args) {
        int[] arr = {11, 14, 25, 31, 43, 56, 69, 80, 96};

        int target = 11;

        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = low + (high - low)/2;

            if (arr[mid] == target){
                System.out.println("Index of target = " + mid);
                break;
            }
            if (arr[mid] < target){
                low = mid + 1;
            }
            if (arr[mid] > target){
                high = mid - 1;
            }
        }
    }
}