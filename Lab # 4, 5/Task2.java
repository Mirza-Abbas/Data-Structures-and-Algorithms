import java.util.Arrays;

class BinarySearch{
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

    static void Binary_Search_2D(int[][] arr, int target){   
        int row = 0;
        int column = arr[row].length - 1;
        while (row <arr.length && column >= 0) {
            if (arr[row][column] == target) {
                System.out.println("Found at index (" + row + ", " + column + ")");
            }
            if (arr[row][column] < target) {
                row++;
            }
            else {
                column--;
            }
        }
    }
}

public class Task2 {
    public static void main(String[] args) {
        int[] a={0,7,3,8,2};
        Arrays.sort(a);
        System.out.println("Found at Index: " + BinarySearch.Binary_Search_1d(a, 0, 4, 7));

        int[][] arr={{1,2},{3,4},{5,6}};
        BinarySearch.Binary_Search_2D(arr,4);
    }
}
