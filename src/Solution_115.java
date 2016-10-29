/**
 * Created by SHN on 10/29/16.
 */
public class Solution_115 {

    private void printdp(int[][]dp){
        for (int[] i : dp){
            for (int j: i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }

    }

    public int numDistinct(String s, String t) {
        char[] t_Arr = t.toCharArray();
        char[] s_Arr = s.toCharArray();

        // row  => s
        // col => t

        int t_size = t_Arr.length;
        int s_size = s_Arr.length;

        int t_index = 0;
        int s_index = 0;

        int[][] dp = new int[s_size+1][t_size+1];

        while (s_index <= s_size){
            while(t_index <= t_size) {
                if (s_index == 0 && t_index == 0) dp[s_index][t_index] = 1;
                else if (s_index == 0) dp[s_index][t_index] = 0;
                else {
                    if (t_index == 0) dp[s_index][t_index] = 1;
                    else{
                        dp[s_index][t_index] += dp[s_index -1 ][t_index ];
                        if (t_Arr[t_index - 1] == s_Arr[s_index - 1]) {
                            dp[s_index][t_index] += dp[s_index - 1][t_index - 1];
                        }
                    }
                }
                t_index++;
            }
            s_index++;
            t_index = 0;
        }

//        System.out.println(dp);
//        printdp(dp);

        return dp[s_size][t_size];
    }
}


/*
HOW to USe:

//        String str_t = "ACE";
//        String str_s = "ABCDE";
//        String str_s = "rabbbit";
//        String str_t = "rabbit";
        String str_s = "eee";
        String str_t = "eee";
//        String str_s = "eee";
//        String str_t = "e";



        Solution_115 sol = new Solution_115();

        System.out.println(sol.numDistinct(str_s,str_t));



 */


/*      Wrong Solution 2

public static int find_L(char[] s, char[] t){
        if (t.length ==0) return 1;
        if (s.length == 0) return 0;

        char letter_t  =  t[0];
        int result = 0;

//        int index
        for(int i = 0 ;i < s.length; i++){
            char c = s[i];
            if (c == letter_t){
                char[] sliced_t = (t.length == 1)? new char[]{} : Arrays.copyOfRange(t,1,t.length);
                char[] sliced_s = (s.length == 1)? new char[]{} : Arrays.copyOfRange(s,i,s.length);
                result += find_L(sliced_s ,sliced_t);
            }
        }

        return result;
    }

    public static int numDistinct(String s, String t) {

        char[] t_Arr = t.toCharArray();
        char[] s_Arr = s.toCharArray();
        int result = 0;

        int index_t_f = 0;
        int index_t_l = t_Arr.length-1;
        int index_s_f = 0;
        int index_s_l = s_Arr.length-1;
        boolean continued = false;

        while(index_s_f < index_s_l){
//            if(s_Arr[index_s_f] == t_Arr[index_t_f] && s_Arr[index_s_l] = t_Arr[index_t_l]){
//
//            }else if (s_Arr[index_s_l] == t_Arr[index_t_l])

            if(s_Arr[index_s_f] == t_Arr[index_t_f]){
                if (s_Arr[index_s_l] == t_Arr[index_t_l]){
                    char[] sliced_t = (t_Arr.length == 1)? new char[]{} : Arrays.copyOfRange(t_Arr,index_t_f+1,index_t_l);
                    char[] sliced_s = (s_Arr.length == 1)? new char[]{} : Arrays.copyOfRange(s_Arr,index_s_f+1,index_s_l);
                    result += find_L(sliced_s ,sliced_t);
                }
                index_s_l --;

            }
            index_s_f++;
        }


        return find_L(s_Arr,t_Arr);

 */


/*
* Wrong Solution 1
*
*
*
*   int counter = 0;

        char[] t_Arr = t.toCharArray();
        char[] s_Arr = s.toCharArray();

        if(s_Arr.length <=0 || s_Arr.length < t_Arr.length) return 0;

        int index_t = 0;
        int index_s = 0;
        while(index_s<s_Arr.length){

        }
        int index_t_tmp = 0;
        while(index_s<s_Arr.length){
            char t_letter =t_Arr[index_t_tmp];
            int index_s_tmp = index_s;
            while(index_s_tmp< s_Arr.length){
                char s_letter = s_Arr[index_s_tmp];
                if(t_letter == s_letter){
                    if(index_t_tmp == t_Arr.length -1 ){
                        counter++;
//                        index_s_tmp = s_Arr.length;

                    }
                    else t_letter = t_Arr[++index_t_tmp];

//                    s_letter = s_Arr[++index_s_tmp];
                }else if(index_s_tmp >= s_Arr.length){

                }
                index_s_tmp ++;
            }
            index_t_tmp = 0;
            index_s++;
        }

        return counter;
*
*
*
*
*
* */