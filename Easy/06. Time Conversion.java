import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */

         String sch=s.substring(8);
         //System.out.println(sch);
         //return "";
         if(sch.equals("AM"))
         {
             int t= Integer.parseInt(s.substring(0,2));
             if(t==12)
             {
                String x="00"+s.substring(2,8);
                return x;
             }
             String time=s.substring(0,8);
             return time;
         }
         else
         {
             String time=s.substring(2,8);
            int t=Integer.parseInt(s.substring(0,2));
            if(t==12)
            {
                String timet=s.substring(0,8);
                return timet;
            }
            t=t+12;
            String tt;
            
            tt=Integer.toString(t);
            time=tt+time;
            return time;
         }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
