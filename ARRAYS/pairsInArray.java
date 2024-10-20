public class pairsInArray{
    public static void pairArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+curr+","+ arr[j]+")"+",");
            }
            System.out.println();
        }
        }
    public static void main(String args[]){
        int num[]={2,3,4,5,6,7};
        pairArr(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
}