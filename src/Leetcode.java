import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by SHN on 10/23/16.
 */
public class Leetcode {
    public static void main(String []args) {
        long start = System.nanoTime();



        Solution_338 sol = new Solution_338();


        int[] solution = sol.countBits(16);
        for(int i: solution)
        System.out.print(i+"\t");
        System.out.println();






        long end = System.nanoTime();
        long used = (end-start);
        System.out.println("used:"+ TimeUnit.NANOSECONDS.toMillis(used)+" ms");
    }
}
