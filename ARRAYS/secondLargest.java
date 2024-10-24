public class secondLargest{
    public static int MaxEle(int arr[]){
        int max = arr[0];
        int secMax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                secMax = max;
                max = arr[i];
            }
        }
        // return max;
        return secMax;
    }
    public static void main(String args[]){
        int score[]={3,4,2,5,1,6};
        int res = MaxEle(score);
        System.out.println("Max element in the array is: "+res);
    }
}