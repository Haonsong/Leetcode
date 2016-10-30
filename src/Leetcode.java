import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by SHN on 10/23/16.
 */
public class Leetcode {
    public static void main(String []args) {




        int[]  test = new int[]{12,-14,-5,12,-2,9,0,9,-3,-3,-14,-6,-4,13,-11,-8,0,5,-7,-6,-10,-13,-7,-14,-3,0,12,5,-8,7,3,-11,0,6,9,13,-8,-6,7,4,6,0,13,-13,-1,9,-13,6,-1,-13,-15,-4,-11,-15,-11,-7,1,-14,13,8,0,2,4,-15,-15,-2,5,-8,7,-11,11,-10,4,1,-15,10,-5,-13,2,1,11,-6,4,-15,-5,8,-7,3,1,-9,-4,-14,0,-15,8,0,-1,-2,7,13,2,-5,11,13,11,11};

//        int[]  test = new int[]{-1,0,1,0} ;
//        int[]  test = new int[]{-1,0,1,2,-1,-4} ;
//        int[] test = new int[]{1,1,-2};

        Solution_15 sol = new Solution_15();
        long start = System.nanoTime();
//        for(int i =0; i<1000;i++)
//            sol.threeSum(test);
        System.out.println(sol.threeSum(test));
        long end = System.nanoTime();
        long used = (end-start);
        System.out.println("used:"+ TimeUnit.NANOSECONDS.toMillis(used)+" ms");

    }
}
