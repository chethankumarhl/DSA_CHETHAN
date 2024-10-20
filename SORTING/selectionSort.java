
// package SORTING;

public class selectionSort {
    public static void selectionSorting(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]) min=j;
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={7,4,8,2,1,5,9,3};
        System.out.println("unsorted array : ");
        printArr(arr);
        selectionSorting(arr);
        System.out.println("sorted array : ");
        printArr(arr);
        
    }
}
