//bubble sort

public class bubbleSort{
    public static void bubble_sort(int[] arr){
        for(int turn=0;turn<arr.length-1;turn++){
            boolean swap = false;
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={4,5,3,1,2};
        System.out.println("Unsorted array:");
        printArr(arr);
        bubble_sort(arr);
        System.out.println("Sorted array:");
        printArr(arr);
    }
}