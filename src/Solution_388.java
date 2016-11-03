/**
 * Created by SHN on 11/1/16.
 */
public class Solution_388 {

    public int lengthLongestPath(String input) {
        String s = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";


        String[] s2 = s.split("\n");
        int i  = 0;
        int cur_level =0;


        for(String sub_s: s2){
            String[] name= sub_s.split("\t");
        }



        String[] s3 = s2[2].split("\t");
        System.out.println(s3[2]);



        return 0;
    }


}
