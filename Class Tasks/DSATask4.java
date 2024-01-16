import java.util.Arrays;

class search{

    static int no_of_attempts;

    public static int binarySearch(int [] a, int x){        //Binary Search Method

        no_of_attempts = 0;

        int p = 0, q = a.length-1, i = 0;

        while (p<=q){

            i = (p+q)/2;
            no_of_attempts++;

            if(a[i]==x){
                return i;
            }

            if(a[i]<x){
                p = i+1;
            } 
            
            else {
                q = i-1;
            }
        } 
        return -1;
    }
}

class DSATask4{
    public static void main(String[] args) {

        int[][] arr1=new int[10][3];
        int[] arr2=new int[30];

        for(int i=0;i<arr1.length;i++){     //inserting data in Array
            arr1[i][0]=(i);
            arr1[i][1]=(i+10);
            arr1[i][2]=(i+20);
        }

        for(int i=0;i<10;i++){  //Converting 2d Array to 1d Array
            arr2[i]=arr1[i][0];
            arr2[i+10]=arr1[i][1];
            arr2[i+20]=arr1[i][2];
        }

        int i, key, x;      //Sorting Array using Bubble Sort
        for (i = 1; i < arr2.length; i++){
            key = arr2[i];
            x = i - 1;
            while (x >= 0 && key < arr2[x]){
                arr2[x + 1] = arr2[x];
                x = x - 1;
            }
            arr2[x + 1] = key;
        }

        //Calling Binary Search Method

        System.out.println("Index No: "+search.binarySearch(arr2, 0));
        System.out.println("No of attempts: : "+search.no_of_attempts);
        System.out.println("\nIndex No: "+search.binarySearch(arr2, 28));
        System.out.println("No of attempts: : "+search.no_of_attempts);
        System.out.println("\nIndex No: "+search.binarySearch(arr2, 63));
        System.out.println("No of attempts: : "+search.no_of_attempts);
    }      
}          