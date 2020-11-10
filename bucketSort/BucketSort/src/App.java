import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int[] input = { 34, 56, 73, 44, 12, 40, 65 };

        bucketSort(input);

        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);
        }

    }

    private static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();

        }

        // Scattering into buckets class
        for (int i = 0; i < input.length; i++) {
            buckets[hashKey(input[i])].add(input[i]);
        }

        // Sorting the buckets
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        // gathering into original array
        int j = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value : buckets[i]) {
                input[j++] = value;
            }
        }

    }

    private static int hashKey(int value) {
        return value / 10;
    }
}
