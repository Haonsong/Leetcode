/**
 * Created by SHN on 10/28/16.
 */
public class Solution_371 {

//    int [] a =  new int []{1,2,3,4};
//        System.out.print(a);
//        if ( getSum(2,6) == 8){
//        System.out.print("pass!");
//    }

    public int getSum (int a, int b){
        while(b != 0) {
            int carry = (0b11111111_11111111_11111111_11111111 & (a & b)) << 1;
//            a = ((a|b) & ~(a&b)) ;
            a = a^b;
            b = carry;
        }
        return a;
    }
}
