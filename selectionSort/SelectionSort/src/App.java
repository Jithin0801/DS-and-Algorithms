import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] intArray = { 20, 34, -12, 0, 456, 1, 3, 20, 34, -12, 0, 456, 1, 3 };
        for (int i = intArray.length - 1; i > 0; i--) {
            int largest = 0;
            for (int j = 1; j <= i; j++) {
                if (intArray[j] > intArray[largest]) {
                    if (i == j) {
                        continue;
                    } else {
                        largest = j;
                    }
                }
            }

            int temp = intArray[i];
            intArray[i] = intArray[largest];
            intArray[largest] = temp;
        }
        System.out.println(Arrays.toString(intArray));
    }
}
