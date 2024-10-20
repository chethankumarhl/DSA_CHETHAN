//leetcode question duplicate element in array

public class LCContainsDuplicate {
    //brute force method
        public static boolean containsDuplicate(int[] nums) {
            for(int i=0;i<nums.length;i++){
                int start = nums[i];
                for(int j=i+1;j<nums.length;j++){
                    if(start==nums[j]) return true;
                }
            }
            return false;
            
        }
        //optimized method

        public static void main(String args[]){
            int arr[]={1,3,4,5,1};
            boolean res = containsDuplicate(arr);
            // boolean res = 
            System.out.print(res);
        }
    }
