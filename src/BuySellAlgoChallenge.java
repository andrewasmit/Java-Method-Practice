public class BuySellAlgoChallenge {
    public static void main(String[] args) {
        int[] arr =new int[]{ 7,5,3,4,10,6 };
        int answer = highestProfit(arr);
        System.out.println(answer);
    }

    public static int highestProfit(int[] prices){
        // Reference the lowest price as we iterate through the array. Starts with first array elem
     int buy = prices[0];
        // Reference the greatest difference between array elements, starting with 0 which is our default if no profit exists.
     int highestProfit = 0;

     // for loop to iterate through the array. Start at index 1 since we already are referencing the first array element
        for (int sell = 1; sell < prices.length; sell++){
            // Check if current sell ( prices[sell] ) is < lowestPrice and update if true
            if(prices[sell] < buy){
                buy = prices[sell];
            } else {
                //subtract sell price from buy and update highestProfit
                int profit = prices[sell] - buy;
                if (profit > highestProfit){
                    highestProfit = profit;
                }
            }
        }
        return highestProfit;
    }
};



// Given an array of numbers that act as a buy/sell price for stocks,
// Find the highest profit possible by buying on one day and selling on a day after that
// IF no profit is possible, return 0.