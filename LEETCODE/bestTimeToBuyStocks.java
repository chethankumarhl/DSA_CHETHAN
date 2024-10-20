//121.Best Time to Buy and Sell Stock
/*Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell. */
public class bestTimeToBuyStocks {
    public static int buySellStock(int[] arr){
        int buyPrice = arr[0];
        int maxProfit = 0;
        for(int i=1;i<arr.length;i++){
            if(buyPrice>arr[i]){
                buyPrice=arr[i];
            }else{
                maxProfit=Math.max(maxProfit,arr[i]-buyPrice);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        System.out.println("max profit is: "+buySellStock(arr));
    }
}
