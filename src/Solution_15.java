import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by SHN on 10/29/16.
 */
public class Solution_15 {

    private ArrayList<Integer> makeList(int[] array){


        ArrayList<Integer> queue = new ArrayList<Integer>();
        for(int i: array){
            queue.add(i);
        }

        Collections.sort(queue);
        return queue;
    }

//    private int sumof (List<Integer> list){
//        int sum = 0;
//        for (int i: list) sum+= i;
//        return sum;
//    }


//    private int findNum(int lh, int rh, ArrayList<Integer> nums){
//        int index = -1;
//        int num1 = nums.get(lh);
//        int num2 = nums.get(rh);
////        if( num1 + num2 < 0) return index;
//        for(int i = lh+1; i<rh; i++){
//            if(num1 + num2 + nums.get(i) == 0){
//                index = i;
//            }
//        }
//        return index;
//    }


    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        ArrayList<Integer> input =  makeList(nums);
        ArrayList<Integer> zero = new ArrayList<Integer>();
        int index = 0;


        while( index < input.size() -1) {
            int new_zero = 0 - input.get(index);
            int lh = index+1;
            int rh = input.size() - 1;
            while (lh < rh) {
                int sum_2 = input.get(lh) + input.get(rh);
                if (sum_2 < new_zero) {
                    lh++;
                } else if (sum_2 > new_zero) {
                    rh--;
                } else {
                    zero.add(input.get(index));
                    zero.add(input.get(lh));
                    zero.add(input.get(rh));
                    if (!result.contains(zero))
                    result.add(new ArrayList<Integer>(zero));
                    zero.clear();
                    lh++;
                    rh--;
                }
            }
            index++;

        }

//            zero.add(input.get(lh));
//                zero.add(input.get(rh));
//            if(input.get(rh) - input.get(lh) < input.get(rh))
//                lh++;
//            else if(input.get(rh) - input.get(lh) > input.get(rh))
//                rh--;
////            int the_index = findNum(lh,rh,input);
//            if(the_index != -1) {
//                zero.add(input.get(lh));
//                zero.add(input.get(the_index));
//                zero.add(input.get(rh));
//
//              if (!result.contains(zero))
//                  result.add(new ArrayList<Integer>(zero));
//                zero.clear();
//            }
//
//
//
//        }

//        List<List<Integer>> copy = new ArrayList<List<Integer>>(result);
//        for (List<Integer> value : new HashSet<List<Integer>>(result)) {
//            copy.remove(value);
//        }
//        int i = 0;
//                  int size = result.size();
//            while(i < size ){
//                List<Integer> temp = result.get(i);
//                result.remove(temp);
//                if(! result.contains(temp)){
//                    result.add(temp);
//                    i++;
//                }else size --;
//
//        }




        return result;
    }
}
