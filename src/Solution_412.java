import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHN on 11/3/16.
 */
public class Solution_412 {

    public List<String> fizzBuzz(int n) {
        int five = 5;
        int three = 3;
        ArrayList<String> res = new ArrayList<>();

        for(int i = 1; i <= n;i++){
            StringBuffer sb = new StringBuffer();
            if(i != three && i != five) sb.append(i);
            if(i == three){
                three += 3;
                sb.append("Fizz");
            }

            if(i == five ){
                five += 5;
                sb.append("Buzz");
            }




            res.add(sb.toString());
        }
        return res;
    }

}
