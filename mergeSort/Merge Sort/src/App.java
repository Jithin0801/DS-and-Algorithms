
public class App {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7 };

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    private static void mergeSort(int[] intArray, int start, int end) {
        if ((end - start) < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(intArray, start, mid);
        mergeSort(intArray, mid, end);
        merge(intArray, start, mid, end);
    }

    private static void merge(int[] intArray, int start, int mid, int end) {
        if (intArray[mid - 1] >= intArray[mid]) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            if (intArray[i] >= intArray[j]) {
                temp[tempIndex] = intArray[i];
                tempIndex++;
                i++;
            } else {
                temp[tempIndex] = intArray[j];
                tempIndex++;
                j++;
            }
        }

        System.arraycopy(intArray, i, intArray, end - tempIndex, mid - i);
        System.arraycopy(temp, 0, intArray, start, tempIndex);
    }
}
