import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by SHN on 10/29/16.
 */
public class Solution_179 {


    private static String largestNumber(int[] nums) {
//        /        System.out.println(largestNumber(new int[]{121,12}));
//        System.out.println(largestNumber(new int[]{12,121}));
//        System.out.println(largestNumber(new int[]{128,12}));
//        System.out.println(largestNumber(new int[]{12,128}));
//        System.out.println(largestNumber(new int[]{0,0}));
//        System.out.println(largestNumber(new int[]{3,43,48,94,85,33,64,32,63,66}));
//
//        String Expected = "98909827968595339456944893859149094902689398937839883538183810810780707982784676057536747174237321720571007032685668066758674466986636554651163276306626562416221603859725909578457125682552954605422520849804812479847044453428339323905384638363699366436503636357535673516346233993298316330843021297028227452732697246523622362231322812216213206020001921763154815181495141713801147114310901048";
//        String Expected2 = "98909827968595339456944893859149094902689398937839883538183810810780707982784676057536747174237321720571007032685668066758674466986636554651163276306626562416221603859725909578457125682552954605422520849804812479847044453428339323905384638363699366436503636357535673516346233993298316330843021297028227452732697246523622362231322812216213206020001921763154815181495141713801147114310901048";
//        String output = largestNumber(new int [] {4704,6306,9385,7536,3462,4798,5422,5529,8070,6241,9094,7846,663,6221,216,6758,8353,3650,3836,8183,3516,5909,6744,1548,5712,2281,3664,7100,6698,7321,4980,8937,3163,5784,3298,9890,1090,7605,1380,1147,1495,3699,9448,5208,9456,3846,3567,6856,2000,3575,7205,2697,5972,7471,1763,1143,1417,6038,2313,6554,9026,8107,9827,7982,9685,3905,8939,1048,282,7423,6327,2970,4453,5460,3399,9533,914,3932,192,3084,6806,273,4283,2060,5682,2,2362,4812,7032,810,2465,6511,213,2362,3021,2745,3636,6265,1518,8398});
//        System.out.println(Expected.equals(output));
//        System.out.print(output);

        ArrayList<ArrayList<Integer>> al = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> sorted_al =new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> max_Num;

        String result ="";

        for( int i : nums){
            ArrayList<Integer>  al2 = new ArrayList<Integer>();
            while (i>= 10){
                int temp = i % 10;
                i = i / 10;
                al2.add(0,temp);
            }
            al2.add(0,i);
            al.add(al2);
        }

        // 2 dimensions array generated.

        while(!al.isEmpty()){
            max_Num = al.get(0);

            for (ArrayList<Integer> Num : al){
                if(Num.get(0).intValue() > max_Num.get(0).intValue() ){
                    max_Num = Num;
                } else if (Num.get(0).intValue() == max_Num.get(0).intValue()){

                    Iterator<Integer> i = Num.iterator();
                    Iterator<Integer> j = max_Num.iterator();
                    Boolean finished = false;
                    while(i.hasNext() && j.hasNext() && !finished) {
                        int digit_i = i.next();
                        int digit_j = j.next();
                        if (digit_i > digit_j) {
                            max_Num = Num;
                            finished = true;
                        } else if (digit_i < digit_j) {
                            finished = true;
                        } else if ((!i.hasNext()) && (!j.hasNext())){
                            finished = true;
                        }

                    }
                    int index_x = 0;
                    int index_y = 0;
                    while(!finished){
                        int x, y;
                        if (j.hasNext()){
                            x = j.next();
                            y = max_Num.get(index_y++);

                        } else if(i.hasNext()) {
                            x = Num.get(index_x++);
                            y = i.next();
                        } else{
                            x =2;
                            y =1;
                            if(index_x<Num.size() && index_y <max_Num.size()){
                                x = Num.get(index_x++);
                                y = max_Num.get(index_y++);
                            }


                        }
                        if (x < y) {
                            max_Num = Num;
                            finished = true;
                        } else if(x > y){
                            finished =true;
                        }


                    }
//                    if(j.hasNext() && !finished){
//
////                        max_Num = Num;
//                        boolean larger = false;
//                        int digit = j.next();
//                        Iterator<ArrayList<Integer>> Num_2 = al.iterator();
//                        while(Num_2.hasNext() && !finished){
//                            ArrayList<Integer> Num2 =Num_2.next();
//
//                            if(Num2.get(0).compareTo(digit) >0)
//                                larger = true;
//                            else if(Num2.get(0).compareTo(digit) == 0 && j.hasNext()){
//
//                                digit = j.next();
//                                Iterator<ArrayList<Integer>> Num3 = al.iterator();
//                                while (Num3.hasNext() && !finished){
//                                    if(Num3.next().get(0).compareTo(digit) >= 0){
//                                        larger =true;
//                                        finished =true;
//                                    }
//                                }
//                            }
//                        }
//
//                        if(larger){
//                            max_Num = Num;
//                        }
//
//                        finished = true;
//                    }
//
//                    if(i.hasNext() && !finished){
//
////                        max_Num = Num;
//                        int digit = i.next();
//                        Iterator<ArrayList<Integer>> Num2 = al.iterator();
//                        boolean larger = true;
//                        while(Num2.hasNext() && !finished){
//
//                            if(Num2.next().get(0).compareTo(digit) >= 0 )
//                                larger = false;
//                        }
//                        if(larger) max_Num = Num;
//                        finished = true;
//                    }
                }
            }

            sorted_al.add(max_Num);
            al.remove(max_Num);

        }

        for(ArrayList<Integer> Num : sorted_al){
            for(int digit:Num){
                if(!(digit == 0 && result == "")) {
                    result += digit;
                }
            }
        }

        if(result == ""){
            return "0";
        }
        else return result;
    }
}
