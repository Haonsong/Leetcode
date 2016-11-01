/**
 * Created by SHN on 11/1/16.
 */
public class Solution_441 {
    public int arrangeCoins(int n) {
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