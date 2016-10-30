import com.sun.tools.javac.code.Attribute;
import com.sun.tools.javac.util.ArrayUtils;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by SHN on 10/29/16.
 */
public class Solution_15 {



    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        ArrayList<Integer> zero = new ArrayList<Integer>();
        int index = 0;


        while( index < nums.length -2) {
            int new_zero = 0 - nums[index];
            int lh = index+1;
            int rh = nums.length - 1;
            while (lh < rh) {
                int sum_2 = nums[lh] + nums[rh];
                if (sum_2 < new_zero) {
                    while (lh+1 < rh && nums[lh] == nums[lh+1])
                        lh++;
                    lh++;
                } else if (sum_2 > new_zero) {
                    while (lh < rh-1 && nums[rh] == nums[rh-1])
                        rh--;
                    rh--;
                } else {
                    zero.add(nums[index]);
                    zero.add(nums[lh]);
                    zero.add(nums[rh]);
//                    if (!result.contains(zero))
                    result.add(new ArrayList<Integer>(zero));
                    zero.clear();
                    while (lh+1 < rh && nums[lh] == nums[lh+1]) lh++;
                    lh++;
                    while (lh < rh-1 && nums[rh] == nums[rh-1]) rh--;
                    rh--;
                }
            }
            while(index +1 < nums.length -2 && nums[index] ==nums[index+1] ) index++;
            index++;
        }
        return result;
    }
}

/*
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
 */
