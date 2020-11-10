public class App {
    public static void main(String[] args) throws Exception {
        int num = 5;
        int factnum = factorial(num);
        System.out.println(factnum);
    }

    private static int factorial(int num) {
        if (num == 0) {
            return 1;
        }

        return num * factorial(num - 1);

    }
}
