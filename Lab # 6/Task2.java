import java.util.Arrays;


public class Task2 {

    public static int[] conversionIn1D(int [][] matrix){
        int[] a=new int[(matrix.length)*matrix[0].length];
        int index=0;
        for (int i=0; i< matrix.length; i++) {
            for (int j=0; j< matrix[i].length; j++) {
                a[index]=matrix[i][j];
                index++;
            }
        }
        return a;
    }    

    public static int[][] conversionIn2D(int [] array, int rows, int cols){
        int[][] matrix = new int[rows][cols];
        int k = 0;
        for (int i=0; i< rows; i++){
            for (int j=0; j< cols; j++){
                matrix[i][j] = array[k];
                k++;
            }
        }
        return matrix;
    }   

    public static int[][] bubbleSort(int [][] matrix){
        int [] array = conversionIn1D(matrix);
        for (int i=0; i<array.length; i++){
            for (int j=i+1; j<array.length; j++){
                if (array[j]<array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return conversionIn2D(array, matrix.length, matrix[0].length);
    }

    public static int[][] insertionSort(int [][] matrix){
        int [] arr = conversionIn1D(matrix);
        for (int i=1; i< arr.length; i++){
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return conversionIn2D(arr, matrix.length, matrix[0].length);
    }        // end of insertionSort() method

    public static int[][] selectionSort(int [][] matrix){
        int [] arr = conversionIn1D(matrix);
        for (int i=0; i< arr.length-1; i++){
            int min = i;
            for (int j=i+1; j< arr.length; j++){
                if (arr[j]<arr[min]){
                    min = j;
                }
            }
            if (i!=min){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        return conversionIn2D(arr, matrix.length, matrix[0].length);
    }     

    public static int partition(int [] a, int lowerbound, int upperbound){
        int pivot = a[upperbound];
        int i = lowerbound-1;
        for (int j=lowerbound; j<upperbound; j++){
            if(a[j]<=pivot){
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i+1];
        a[i+1] = a[upperbound];
        a[upperbound] = temp;
        return (i+1);
    }

    public static void quickSort(int [] a, int lowerbound, int upperbound){
        if(lowerbound<upperbound){
            int location = partition(a, lowerbound, upperbound);
            quickSort(a, lowerbound, location-1);
            quickSort(a, location+1, upperbound);
        }
    }


    public static void main(String[] args) {

        int [][] matrix = {{2, 10, 15}, {5, 1, 3}, {6, 9, 4}};
        System.out.println("Using BubbleSort: \n" + Arrays.deepToString(bubbleSort(matrix)));
        System.out.println("\nUsing SelectionSort: \n" + Arrays.deepToString(selectionSort(matrix)));
        System.out.println("\nUsing InsertionSort: \n" + Arrays.deepToString(insertionSort(matrix)));

        int [] array = conversionIn1D(matrix);
        quickSort(array, 0, array.length-1);
        matrix  = conversionIn2D(array, matrix.length, matrix[0].length);
        System.out.println("\nUsing QuickSort: \n" + Arrays.deepToString(matrix));

    }   
}      