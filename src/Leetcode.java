import java.util.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by SHN on 10/23/16.
 */
public class Leetcode {
    public static void main(String []args) {


        long start = System.nanoTime();

        long end = System.nanoTime();
        long used = (end-start);
        System.out.println("used:"+ TimeUnit.NANOSECONDS.toMillis(used)+" ms");

    }
}
