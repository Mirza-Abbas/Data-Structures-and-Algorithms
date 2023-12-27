import java.util.Arrays;

class Methods{
    static void Linear_Search_1d(int[] a, int target ){
        for(int i=0;i<a.length;i++){
            if(target==a[i]){
                System.out.println(target + " Found at index " + i);
                break;
            }
            else if(i==a.length-1){
                System.out.println("Not Found");
            }
        }
    }

    static int Binary_Search_1d(int[] arr, int first, int last, int target){
        while (first <= last) {
            int mid = (first + last) / 2;
            if (arr[mid] == target){
                return mid;
            }
            if (arr[mid] < target){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        return -1;
    }
}

public class Task3 {
    public static void main(String[] args) {
        int[] a={0,7,3,8,2};
        int target=7;
        Arrays.sort(a);

        long Linear_Search_Time=System.nanoTime();
        Methods.Linear_Search_1d(a, target);
        Linear_Search_Time=System.nanoTime()-Linear_Search_Time;
        System.out.println("Time Taken by Linear Search: " + Linear_Search_Time + " Nanoseconds\n");

        long Binary_Search_Time=System.nanoTime();
        System.out.println(target+" Found at index "+Methods.Binary_Search_1d(a, 0, 5, target));
        Binary_Search_Time=System.nanoTime()-Binary_Search_Time;
        System.out.println("Time Taken bu Binary Search: " + Binary_Search_Time + " Nanoseconds\n");


    }
}
