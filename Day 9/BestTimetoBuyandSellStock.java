public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        
        int arr[] = {7,1,5,3,6,4};
        int maxPro = maxProfit(arr);

        System.out.println("Max Profit is:" + maxPro);

    }

    public static int maxProfit(int[] prices) {
        int mini = prices[0];
        int MaxProfit = 0;
        int n = prices.length;
        for(int i = 0; i < n;i++){
            int cost = prices[i] - mini;
            MaxProfit = Math.max(MaxProfit, cost);
            mini = Math.min(mini,prices[i]);
        }
        return MaxProfit;
    }
}