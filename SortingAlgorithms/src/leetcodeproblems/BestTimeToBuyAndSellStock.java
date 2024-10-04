package leetcodeproblems;

//Leetcode problem link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
public class BestTimeToBuyAndSellStock {
    //Method to get the maxProfit with the given list of prices
    private static int getMaxProfit(int[] prices) {
        //Initialize minPrice and maxProfit variables to track minPrice in the list and maxProfit to get the maxProfit
        int minPrice = -1, maxProfit = 0;
        //Iterate over the prices
        for (int price : prices) {
            // Get the minPrice till day
            if (price < minPrice) {
                minPrice = price;
            }
            //Check if we get the maxProfit on any day and store it in maxProfit
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        //return maxProfit
        return maxProfit;
    }

    public static void main(String[] args) {
        //Array of prices of the stock
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("The maximum profit that we can make is : " + getMaxProfit(prices));
    }
}

