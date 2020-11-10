import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] newArray = new int[10000];
        for (int i = 9999; i >= 0; i--) {
            newArray[i] = i;
        }
        System.out.println(Arrays.toString(newArray));
        for (int i = newArray.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (newArray[j] > newArray[j + 1]) {
                    swap(newArray, j, j + 1);
                }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
