import java.util.*;
public class merge_sort{
    //merge function which will merge the sorted part by doing the comparision.
    public static void merge(int[] arr,int low,int mid,int high){
        ArrayList<Integer> temp = new ArrayList<>();//temporary array
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i]=temp.get(i-low);
        }
    }
    public static void mergeSort(int[] arr, int low,int high){
        if(low==high) return;
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,1,2,4,1,5,2,6,4};
        System.out.println("Unsorted array:");
        printArray(arr);
        mergeSort(arr, 0, arr.length-1);
        System.out.println("sorted array:");
        printArray(arr);
    }
}