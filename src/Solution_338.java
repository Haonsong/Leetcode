/**
 * Created by SHN on 10/30/16.
 */
public class Solution_338 {
    public int[] countBits(int num) {

        int[] res = new int[num+1];
        for(int i = 0; i <= num ;i++){
            res[i] = (i%2 == 0)? res[i/2] : res[i-1]+1;
        }
        return res;
    }


    public int[] countBits2(int num) {

        int[] res = new int[num+1];
        for(int i = 0; i <= num ;i++){
            int counter =0;
            int j =0;
            int mask = 0b1;
            while(j < 32){
                int temp =  mask & i;
                if(temp != 0) counter++;
                mask = mask << 1;
                j++;
            }
            res[i] = counter;
        }
        return res;

    }
}
