class LinearSearch{
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

    static void Linear_Search_2d(int[][]a, int target){
        for(int i=0;i<a.length;i++){
            for(int x=0;x<a[0].length;x++){
                if(a[i][x]==target){
                    System.out.println(target + " Found at index (" + i + ", " + x + ")");
                }
            }
        }
    }
}

class Task1{
    public static void main(String[] args) {
        int[] ar={1,2,3,4,5};
        LinearSearch.Linear_Search_1d(ar, 4);
        int[][] arr={{1,2},{3,4},{5,6}};
        LinearSearch.Linear_Search_2d(arr, 6);
    }
}