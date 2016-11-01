import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by SHN on 10/31/16.
 */
public class Solution_437 {
    private int res;
    private int sum;

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;

          TreeNode(int x) {
              val = x;
          }
      }


    private void sum_List2 (TreeNode node, ArrayList<Integer> list){

//        if(node != null){
            int new_sum = this.sum - node.val;

            if(new_sum == 0) this.res++;

            list.add(0,new_sum);

            for(int i=1; i < list.size()-1;i++){
                new_sum = list.get(i) - node.val;
                if(new_sum == 0) this.res++;
                list.set(i,new_sum);
            }
            if(node.left != null) sum_List2(node.left, new ArrayList<Integer>(list));
            if(node.right != null) sum_List2(node.right, new ArrayList<Integer>(list));

    }

    private int sum_List(TreeNode node, int sum, HashMap<Integer,Integer> sum_Map){
        if(node == null) return 0;

        sum+= node.val;
        int match = sum_Map.getOrDefault(sum - this.sum, 0);
        sum_Map.put(sum, sum_Map.getOrDefault(sum,0) + 1);

        match+= sum_List(node.left,sum,sum_Map) + sum_List(node.right,sum,sum_Map);
        sum_Map.put(sum, sum_Map.get(sum) - 1);

        return match;
    }


    public int pathSum(TreeNode root, int sum) {
//        this.res  = 0;
        this.sum = sum;

        if(root == null) return 0;

        HashMap<Integer,Integer> sum_Map = new HashMap<>();

        sum_Map.put(0,1);





        return sum_List(root,0,sum_Map);
    }
}
