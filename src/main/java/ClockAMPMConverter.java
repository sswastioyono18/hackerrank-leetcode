import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ClockAMPMConverter {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String AMPM = s.substring(s.length()-2, s.length());
        String[] timeZone = s.split(":");
        int plus12 = 0;
        String additionalZero = "0";
        if(AMPM.equals("PM")) {
            if(s.substring(0,2).equals("12")){
                return s.substring(0, s.length()-2);
            } else {
                plus12 = Integer.parseInt(timeZone[0]) + 12;
                s = plus12  + s.substring(2);
            }
        } else {
            if(s.substring(0,2).equals("12")){
                plus12 = Integer.parseInt(timeZone[0]) - 12;
                s = plus12 + additionalZero + s.substring(2);
            }
        }

        return s.substring(0, s.length()-2);

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion("06:40:03AM");
        System.out.println(result);
//        bw.write(result);
//        bw.newLine();

//        bw.close();
    }
}
