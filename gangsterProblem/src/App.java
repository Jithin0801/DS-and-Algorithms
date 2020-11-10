import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class App {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int applesCount = 0;
        for (int i = 0; i < apples.length; i++) {
            int landingCord = a + apples[i];
            if (landingCord >= s && landingCord <= t) {
                applesCount++;
            }
        }
        System.out.println(applesCount);
        int orangesCount = 0;
        for (int i = 0; i < oranges.length; i++) {
            int landingCord = a + apples[i];
            if (landingCord >= s && landingCord <= t) {
                orangesCount++;
            }
        }
        System.out.println(orangesCount);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] apples = { -2, 2, 1 };
        int[] oranges = { 5, -6 };

        countApplesAndOranges(7, 11, 5, 15, apples, oranges);

    }
}
