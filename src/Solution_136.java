/**
 * Created by SHN on 10/31/16.
 */
public class Solution_136 {
    public int singleNumber(int[] nums) {

        if (nums.length == 1) return nums[0];

        int res = nums[0] ^ nums[1];
        for(int i= 2; i <nums.length; i++){
            res ^= nums[i];
        }

        return res;
    }
}
