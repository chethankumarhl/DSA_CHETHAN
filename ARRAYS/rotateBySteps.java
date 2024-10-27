public class rotateBySteps {
    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate_by_step(int[] arr, int k){
        int n = arr.length;
        reverse(arr,0,k-1); // reverse first k elements : //to right reverse(arr,0,n-k-1)
        reverse(arr, k, n-1);// reverse next n-k ele: //to right reverse(arr,k,n-1)
        reverse(arr, 0, n-1);//reverse whole //to right reverse(arr,0,n-1)

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int k = 3;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        rotate_by_step(arr, k);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
