public class SortaSum {
    static int sortaSum(int a, int b) {
        if (10 <= (a + b) && (a + b) <= 19) {
            return 20;
        } else {
            return a + b;
        }
    }

    public static void main(String[] args) {
        System.out.println(sortaSum(10, 20));
    }
}