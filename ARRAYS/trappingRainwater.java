public class trappingRainwater {
    public static int trappedRainWater(int[] arr){
        int n = arr.length; //length of the array
        //Left-Max Array
        int leftMax[] = new int[n]; //initializing leftmax array
        leftMax[0] = arr[0]; //initializing because there will be first ele which is left highest
        for(int i=1;i<n;i++){ //finding the maximum leftMost element.
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }
        //Right-Max Array
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){//finding the rightMost maximum element
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
        int trappedWater = 0;
        for(int i=0;i<n;i++){
            //check te=he water level with formula min(leftMax,RightMax);
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-arr[i]; //trappedWater = waterlevel-heightOfBar.
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(arr));
    }
    
}
