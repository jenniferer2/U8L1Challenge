import java.util.ArrayList;
import java.util.Arrays;
public class Challenge {

    public static void main (String [] args) {
         String[][] seats = {
                {"Moiz", "Angie", "Taran", "Kelvin", "Kyler", "David", "WenHao Huang", "Nicole", "Jennifer", "Michelle",null,null},
                {"Beckett", "Raymond", "Lucy", "Apramjot", "Justin Lema", "Sam", "Tristan", "Pradeep", "Mohammad", "Haley",  "Rely", null},
                {"Cheng Han", ",Qihan", ",Kevin", ",Ryan", ",Justin Liu", ",Jeffrey", ",Danny", ",Elliot", ",Benson", ",Fiona", ",Neil", "Kaitlyn"}
        };

        String[][] seatNum =  new String[3][12];
        ArrayList[] names =  ArrayList (0);
        for (String [] x : seats) {
            for (String y : x) {
                names.add(y);
            }
        }

        int x = 0 ;
        int y = 0;
        String hold = "";
        for ()



// start at first index of the seat num, grab a random person in seats and put that index. repeat teh process when there is already someone in that index or that index someo





        for (String []na : seats) {
          System.out.println(" \n"+ Arrays.toString(na));
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        for (String []n : seatNum) {
            System.out.println(Arrays.toString(n));
        }







    }
}

