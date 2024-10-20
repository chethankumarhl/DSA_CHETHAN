public class buyAndSellStocks{
    public static int buySellStocks(int[] arr){
        int buyPrice = Integer.MAX_VALUE; //let buyPrice be maximum value and set it first value in first iteration
        int maxProfit = 0;// max prfit will be zero if no profit detected
        for(int i=0;i<arr.length;i++){ //loop through prices to find max profit
            if(buyPrice<arr[i]){ // if buyprice is less than price of the day(sell) then buy it
                int profit = arr[i]-buyPrice; //calculate profit 
                maxProfit=Math.max(maxProfit, profit);// find max 
            }else{
                buyPrice=arr[i]; // if it is not the less price fix buyPrice as next lowest val
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.err.println(buySellStocks(arr));
    }
}