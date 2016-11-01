/**
 * Created by SHN on 11/1/16.
 */
public class Solution_441 {

    public int arrangeCoins(int n) {
        // covert to long type to solve the overflow, (1+(1+(n-1)*d)*n/2 = sum of arithmetic seq
        return (int) (Math.sqrt( (2*(long)n) + 0.25) -0.5);
    }

    public int arrangeCoins2(int n) {
        int i = 1;
        while(n>=i){
            n-= i;
            i++;
        }
        return i;
    }
}

/*

Test cases
1
5
8
9
10
22
100
 */