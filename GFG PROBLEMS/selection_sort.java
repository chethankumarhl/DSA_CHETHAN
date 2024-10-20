
public class selection_sort {
    public static int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int minIndex = i;
        for(int j=i+1;j<arr.length;j++){
            
            if(arr[j]<arr[minIndex]){
                minIndex = j;
            }
        }
        return minIndex;
        
	}
	
	public static void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0;i<n-1;i++){
	        int minIndex = select(arr,i);
	        int temp = arr[i];
	        arr[i] = arr[minIndex];
	        arr[minIndex] = temp;
	        
	    }
	}
    
    public static void main(String[] args) {
        int arr[]={7,4,8,2,1,5,9,3};
        // System.out.println("unsorted array : ");
        // printArr(arr);
        selectionSort(arr,arr.length);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        // System.out.println("sorted array : ");
        // printArr(arr);
        
    }
}
