import java.util.*;
public class Buy_and_sell_stocks{
    public static int profit(int prices[]){
        int maxprofit = 0;
        int buy_price = Integer.MAX_VALUE;
        int profit = 0;

        for(int i =0 ; i<prices.length; i++){
            buy_price = Math.min(prices[i], buy_price);
            if(prices[i] > buy_price){
                profit = prices[i] - buy_price;
            }
            if(profit > maxprofit){
                maxprofit = profit;
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        System.out.println(profit(prices));
        
    }
}