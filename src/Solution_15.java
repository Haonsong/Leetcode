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
