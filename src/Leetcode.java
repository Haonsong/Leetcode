import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by SHN on 10/23/16.
 */
public class Leetcode {
    public static void main(String []args) {
        ////////////////////////////////////////
        long start = System.nanoTime();       //
        ////////////////////////////////////////

//        String str = "0123457890";
//
//        System.out.println(str.substring(3,5));
        Solution_438 sol = new Solution_438();
        System.out.println( sol.findAnagrams("aaaaa","aaa"));
        System.out.println("abc".compareTo("abc"));



        ////////////////////////////////////////////////////////////////////////////////
        long end = System.nanoTime();                                                 //
        long used = (end-start);                                                      //
        System.out.println("used:"+ TimeUnit.NANOSECONDS.toMillis(used)+" ms");       //
        ////////////////////////////////////////////////////////////////////////////////
    }
}
