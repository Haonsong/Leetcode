import java.util.*;

/**
 * Created by SHN on 11/1/16.
 */
public class Solution_438 {

    private String to_letters (String words){
        char[] letters = words.toCharArray();
        StringBuffer sb = new StringBuffer();

        Arrays.sort(letters);

        for(char c: letters)
            sb.append(c);

        return sb.toString();
    }

    public List<Integer> findAnagrams2(String s, String p) {
        ArrayList<Integer> res =  new ArrayList<>();

//        char[] source_Array = s.toCharArray();
        String target_Letters = to_letters(p);
        int p_size = p.length();
//        HashMap<String,>

        for(int i = 0; i< s.length()-p_size+1; i++ ){
            String sub = to_letters(s.substring(i,i+p_size));
            if(sub.equals(target_Letters))
                res.add(i);
        }
        return res;
    }


    public List<Integer> findAnagrams(String s, String p) {
        int[] alpha = new  int[26];
        ArrayList<Integer> res =  new ArrayList<>();

        for(char c: p.toCharArray())
            alpha[c-'a'] ++;

        int lh = 0, rh = 0, p_size = p.length();


        while (rh < s.length()){
            if (rh - lh >= p.length()){
                int tmp = alpha[s.charAt(lh++) - 'a']++;
                if(tmp>=0) p_size++;
            }
            if(--alpha[s.charAt(rh++)-'a'] >= 0)
                p_size--;

            if (p_size == 0)
                res.add(lh);
        }


        return res;
    }
}
