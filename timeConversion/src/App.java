import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class App {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String listTime[] = s.split(":");
        String hour = listTime[0];
        String minutes = listTime[1];
        String secounds = listTime[2].substring(0, 2);
        String caser = listTime[2].substring(2, 4);
        if (caser.equals("AM")) {
            if (hour.equals("12"))
                hour = "00";

            System.out.println(hour + ":" + minutes + ":" + secounds);
        } else {
            if (!hour.equals("12")) {
                int h = Integer.parseInt(hour);
                h = h + 12;
                hour = "" + h;
            }
            System.out.println(hour + ":" + minutes + ":" + secounds);
        }
        return hour + ":" + minutes + ":" + secounds;

    }

    public static void main(String[] args) throws IOException {
        // BufferedWriter bw = new BufferedWriter(new
        // FileWriter(System.getenv("OUTPUT_PATH")));

        // String s = scan.nextLine();

        String result = timeConversion("02:05:45PM");

        // bw.write(result);
        // bw.newLine();

        // bw.close();
    }
}
