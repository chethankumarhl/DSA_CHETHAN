public class checkSorted {
    public static int checkSorted(int [] arr){
        int isSorted = 1;
        for(int i=1;i<arr.length;i++){
            
            if(arr[i]<arr[i-1]){
                isSorted = 0;
            }
        }
        return isSorted;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1};
        int res = checkSorted(arr);
        if(res == 1){
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }
    }
}
