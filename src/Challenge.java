import java.util.ArrayList;
import java.util.Arrays;
public class Challenge {

    public static void main(String[] args) {
        String[][] seats = {
                {"Moiz", "Angie", "Taran", "Kelvin", "Kyler", "David", "WenHao Huang", "Nicole", "Jennifer", "Michelle", null, null},
                {"Beckett", "Raymond", "Lucy", "Apramjot", "Justin Lema", "Sam", "Tristan", "Pradeep", "Mohammad", "Haley", null, "Rely"},
                {"Cheng Han", "Qihan", "Kevin", "Ryan", "Justin Liu", "Jeffrey", "Danny", "Elliot", "Benson", "Fiona", "Neil", "Kaitlyn"}
        };


        ArrayList<String> names = new ArrayList<String>();
        String[][] news = new String[3][12];


        for (int row = 0; row < seats.length; row++) {

            for (int col = 0; col < seats[0].length; col++) {
                names.add(seats[row][col]);

            }

        }

        int diff = 36;


        for (int r = 0; r < news.length; r++) {
            for (int c = 0; c < news[0].length; c++) {
                int num = (int) (Math.random() * diff);
                news[r][c] = names.get(num);
                names.remove(num);
                diff--;
            }
        }


        for (String[] r : news) {
            for (String c : r) {
                System.out.print(c + " ");
            }
        }
    }
}










