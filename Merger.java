class Merger{
    public static void bubbleSort(int[] arr){
        int i, j, temp;
        boolean swapped;
        int n = arr.length;
        for (i = 0; i < n - 1; i++){
            swapped = false;
            for (j = 0; j < n - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
    static void printArray(int[]arr){
        int n = arr.length;
        for (int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static int[] mergeArrays(int[] arr1, int[] arr2){
        int[] merged = new int[arr1.length + arr2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]) merged[k++] = arr1[i++];
            else merged[k++] = arr2[j++];
        }
        while (i < arr1.length){
            merged[k++] = arr1[i++];
        }
        while (j < arr2.length){
            merged[k++] = arr2[j++];
        }
        return merged;
    }
    public static void main(String[] args) {
        int[] arr1 = {64, 31, 26, 74, 43};
        int[] arr2 = {23, 54, 45, 12, 83};

        bubbleSort(arr1);
        bubbleSort(arr2);

        int[] mergedArr = mergeArrays(arr1, arr2);

        System.out.println("Sorted array 1:");
        printArray(arr1);

        System.out.println("Sorted array 2:");
        printArray(arr2);

        System.out.println("Merged sorted array 1:");
        printArray(mergedArr);

    }
}