import java.util.Arrays;

class Task4 {
    static int Binary_Search(int[] a, int target, int start_index, int end_index){
        Arrays.sort(a);

        if(a.length==0){
            return -1;
        }
        else if (end_index >= start_index && start_index <= a.length - 1) {
            int mid = end_index-start_index / 2;
            if (a[mid] == target){
                return mid;
            }
            else if (a[mid] > target){
                return Binary_Search(a, target, start_index, mid - 1);
            }
            else if (a[mid] < target){
                return Binary_Search(a, target, mid + 1, end_index);
            }
        }
        return -1;

    }

    public static void main(String[] args) {
       int[] a={1,2,3,4,5};
       int end_index=a.length-1;

        System.out.println("\nFound at index " + Binary_Search(a, 3, 0, end_index) + "\n");
    }
}
