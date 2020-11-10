public class App {
    public static void main(String[] args) throws Exception {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        quickSort(intArray, 0, intArray.length);

        for (int i : intArray) {
            System.out.println(i);

        }
    }

    private static void quickSort(int[] intArray, int start, int end) {

        if ((end - start) < 2) {
            return;
        }

        int pivotIndex = partition(intArray, start, end);
        quickSort(intArray, start, pivotIndex);
        quickSort(intArray, pivotIndex + 1, end);

    }

    private static int partition(int[] intArray, int start, int end) {

        int pivotIndex = intArray[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && intArray[--j] >= pivotIndex)
                ;
            if (i < j) {
                intArray[i] = intArray[j];
            }

            while (i < j && intArray[++i] <= pivotIndex)
                ;
            if (i < j) {
                intArray[j] = intArray[i];
            }

        }
        intArray[j] = pivotIndex;
        return j;
    }
}
