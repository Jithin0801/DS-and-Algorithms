import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return a n INTEGER. The function accepts
     * following parameters: 1. INTEGER_ARRAY a 2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        Integer[] arr = new Integer[a.size()];
        Integer[] brr = new Integer[b.size()];

        arr = a.toArray(arr);
        brr = b.toArray(brr);

        int lcm = lcm(arr);

        int gcd = findGCD(brr, brr.length);

        Integer[] factors = findFactors(lcm, gcd, a.get(a.size() - 1));

        // System.out.println(lcm + " " + gcd);

        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i] + ",");
        }
        int count = 0;
        for (int i = 0; i < factors.length; i++) {
            boolean factorized = false;

            for (int j = 0; j < arr.length; j++) {
                if (factors[i] % arr[j] == 0) {
                    factorized = true;
                } else {
                    factorized = false;
                    break;
                }
            }
            if (factorized == true) {
                count++;
            }

            for (int j = 0; j < brr.length; j++) {
                if (factors[i] % brr[j] == 0) {
                    factorized = true;
                } else {
                    factorized = false;
                    break;
                }
            }
            if (factorized == true) {
                count++;
            }
        }

        return count;

    }

    public static Integer[] findFactors(int a, int b, int n) {

        List<Integer> facotrList = new ArrayList<>();

        facotrList.add(n);

        while (a < b) {
            facotrList.add(a);

            a = a + a;
        }

        Integer[] factors = new Integer[facotrList.size()];

        factors = facotrList.toArray(factors);

        return factors;

    }

    // 2, 5
    public static int lcm(Integer[] arr) {
        int lcm_of_numbers = 1;
        int divisor = 2;

        while (true) {
            int count = 0;
            boolean divisible = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    return 0;
                } else if (arr[i] < 0) {
                    arr[i] = arr[i] * (-1);
                } else if (arr[i] == 1) {
                    count++;
                }

                if (arr[i] % divisor == 0) {
                    divisible = true;
                    arr[i] = arr[i] / divisor;
                }
            }
            if (divisible) {
                lcm_of_numbers = lcm_of_numbers * divisor;
            } else {
                divisor++;
            }

            if (count == arr.length) {
                return lcm_of_numbers;
            }

        }
    }

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static int findGCD(Integer brr[], int n) {
        int result = 0;
        for (int element : brr) {
            result = gcd(result, element);

            if (result == 1) {
                return 1;
            }
        }

        return result;
    }

}

public class App {
    public static void main(String[] args) throws IOException {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);

        List<Integer> brr = new ArrayList<>();

        brr.add(72);
        brr.add(48);
        int total = Result.getTotalX(arr, brr);

        System.out.println(total);
    }
}
