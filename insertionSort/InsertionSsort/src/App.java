import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] myAr = { 3, 445, -302, -9 };

        // for (int unsortedIndex = 1; unsortedIndex < myAr.length; unsortedIndex++) {
        // int newElement = myAr[unsortedIndex];

        // int i;
        // for (i = unsortedIndex; i > 0 && myAr[i - 1] > newElement; i--) {
        // myAr[i] = myAr[i - 1];

        // }
        // myAr[i] = newElement;
        // }

        insertion(myAr, myAr.length);

        for (int i = 0; i < myAr.length; i++) {
            System.out.println(myAr[i]);
        }

    }

    // int[] myAr = { 3, 445, -302, -9 };
    private static void insertion(int[] myAr, int length) {
        if (length < 2) {
            return;
        }
        insertion(myAr, length - 1);
        int newElement = myAr[length - 1];
        int i;
        for (i = length - 1; i > 0 && myAr[i - 1] > newElement; i--) {
            myAr[i] = myAr[i - 1];

        }
        myAr[i] = newElement;
    }
}
