public class buysellstocks{
    public static int buysellStocks(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i = 0; i<prices.length; i++){
            if(buyprice<prices[i]){ // means es case me profit aa raha ha 
            int profit = prices[i] - buyprice; // This is today's profit
            max_profit = Math.max(profit,max_profit);
                
            }
            else{
                buyprice = prices[i]; // jis din koi profit na hua ham buyprice ki value ko update kar dege means current price ki value us me daldega(agar profit aaj ka din nahi aaya to ham mean to say us din buy karlega)
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int ans = buysellStocks(prices);
        System.out.println("The maximum profit is: "+ans);
    }
}

// time complexity is o(n)
