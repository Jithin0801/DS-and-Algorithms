import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] myAr = { -9, 56, 53, -19, 3, 50, 14 };

        for (int gap = myAr.length / 2; gap > 0; gap = gap /= 2) {

            for (int i = gap; i < myAr.length; i++) {

                int j = i;
                int newElement = myAr[i];

                while (j >= gap && myAr[j - gap] > newElement) {

                    myAr[j] = myAr[j - gap];
                    j -= gap;

                }

                myAr[j] = newElement;
            }

        }
        System.out.println(Arrays.toString(myAr));

    }
}
