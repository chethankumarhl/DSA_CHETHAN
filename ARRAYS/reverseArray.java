public class reverseArray{
    public static void revArr(int arr[]){
        int i=0,end=arr.length-1;
        while(i<end){
            // swap
            int temp=arr[end];
            arr[end]=arr[i];
            arr[i]=temp;
            i++;
            end--;
        }
    }
    public static void main(String args[]){
        int num[]={2,3,4,5,6,7};
        revArr(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}