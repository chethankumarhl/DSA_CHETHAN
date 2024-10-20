// import java.util.;
public class kadanesAlgorithm {
    public static int kadanesAlgo(int arr[]){
        // int max = Integer.MIN_VALUE;
        // int currSum = 0;
        // for(int i=0;i<arr.length;i++){
        //     currSum+=arr[i];
        //     if(currSum<0){
        //         currSum=0;
        //     }
        //     max=Math.max(max,currSum);
        // }
//leetcode solution
        int max = arr[0];
        int cs = arr[0];
        for(int i=1;i<arr.length;i++){
            cs = Math.max(arr[i],cs+arr[i]);
            max=Math.max(max,cs);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        // int[] arr={-1};
        int result = kadanesAlgo(arr);
        System.out.println("Max is: "+result);
    }
}
