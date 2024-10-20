public class binarySearch{
    public static int binSearch(int num[],int key){
        int start=0,end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
        int num[]={2,3,4,5,6,7};
        int key = 5;
        int res = binSearch(num,key);
        if(res==-1){
            System.out.println("Nuumber not found in the array");
        }else{
            System.out.println("Number found at index: "+res);
        }
        
    }
}