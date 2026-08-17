import java.util.*;
class Broken_Economy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array:");
        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println("Enter target within array:");
        int d = sc.nextInt();

        int ceil = Integer.MIN_VALUE;
        int floor = Integer.MAX_VALUE;

        int lo = 0;
        int hi = n - 1;

        while(lo <= hi){
            int mid = (hi + lo)/2;

            if (a[mid] == d){
                ceil = a[mid];
                floor = a[mid];
                break;
            }else if(a[mid] < d){
                floor = a[mid];
                lo = mid + 1;
            }else{
                ceil = a[mid];
                hi = mid - 1;
            }
        }
        System.out.println("Ceil = " + ceil);
        System.out.println("Floor = " + floor);
    }
}