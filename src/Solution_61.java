/**
 * Created by SHN on 10/29/16.
 */
public class Solution_61 {
    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
    public static ListNode rotateRight(ListNode head, int k) {

        if( head ==null) return null;
        if(k == 0) return head;
        ListNode it = head;
        int slicer = 0;
        int size = 0;
        while(it != null){
            it = it.next;
            size++;
        }
        if (size == 1) return head;

//        if(size == 2) return
        slicer = k % size;

        if(slicer != 0) slicer = size - slicer;

//        System.out.println("Size: " + size + "\tslice: " +slicer);

        it = head;
        for ( int i = 0; i < slicer; i++){
            it = it.next;
        }
        ListNode temp_node = it;
        while(temp_node.next != null){
            temp_node = temp_node.next;
        }
//        System.out.println("temp_node: "+ temp_node.val);
        for(int i = 0; i<= slicer-1; i++){
            temp_node.next = head;
            temp_node = temp_node.next;
//            System.out.println("This head: "+ head.val);
            head = head.next;
        }
        temp_node.next =null;


        return it;
    }

}


/*
* How to use
*
*/
//        System.out.println("210".compareTo("21"));
//
//        int size = 2;
//        int i  = 1;
//        ArrayList<ListNode> al =new ArrayList<>();
//        while(i <= size){
//            al.add(new ListNode(i));
//            i++;
//        }
//        int index = 1;
//        for(ListNode ln : al){
//            if(index<size)
//            ln.next = al.get(index++);
//        }
//        ListNode head = al.get(0);
//        ListNode head2 = al.get(0);
//        while(head2 != null){
//            System.out.print(head2.val + "-->");
//            head2 = head2.next;
//        }
//        System.out.print("null\n");
//
//        head = rotateRight(head,2);
//
//
//        while(head != null){
//            System.out.print(head.val + "-->");
//            head = head.next;
//        }
//        System.out.print("null\n");
//
//    }
//    }