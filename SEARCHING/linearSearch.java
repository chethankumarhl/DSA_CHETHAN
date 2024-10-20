public class linearSearch{
    public static int lSearch(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
           return 0;
    }
    public static void main(String args[]){
        int score[]={3,4,2,5,1,6};
        
        System.out.println(lSearch(score,6));
    }
}