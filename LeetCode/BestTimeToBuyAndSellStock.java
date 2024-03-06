package LeetCode;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE; // least so far
        int op = 0; // overall profit
        int pist = 0; // profit if sold today

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < lsf) { // if we found new buy value which is more smaller then previous one
                lsf = prices[i]; // update our least so far
            }
            pist = prices[i] - lsf; // calculating profit if sold today by, Buy - sell
            if (op < pist) { // if pist is more then our previous overall profit
                op = pist;
            }
//       Exceeds time limit
//        int max = 0;
//        for ( int i=0; i < prices.length-1; i++) {
//            for ( int j=i+1; j< prices.length; j++) {
//                if ((prices[j]-prices[i]) > max)
//                    max = (prices[j]-prices[i]);
//            }
//        }
//        return max;
        }
        return op;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
        int arr[] = {7,1,5,3,6,4};

        System.out.println(bestTimeToBuyAndSellStock.maxProfit(arr));

    }
}
