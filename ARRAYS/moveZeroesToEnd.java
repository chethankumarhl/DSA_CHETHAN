public class moveZeroesToEnd {
    public static void move_zeroes_to_end(int[] arr){
        int j = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }
        if(j==-1) return;
        for(int i=j+1;i<arr.length;i++){
            if(arr[i]!=0){
                int temp =arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,3,4,5,0,6};
        move_zeroes_to_end(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
