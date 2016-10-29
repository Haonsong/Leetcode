/**
 * Created by SHN on 10/29/16.
 */
public class Solution_121 {

    public static int maxProfit(int[] prices){

        int size = prices.length;
        if (size == 0) return 0;
        int min= 9999999;
        int max = 0;
        for(int i =0;i < size; i++) {
            if(prices[i] < min ) min = prices[i];
            int diff = prices[i] - min;
            if(max < diff) max = diff;
        }


        return max;
    }
}
/*

Test

//
//        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
//        System.out.println(maxProfit(new int[]{}));
//        System.out.println(maxProfit(new int[]{1,2}));


*/