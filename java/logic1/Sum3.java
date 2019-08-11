public class Sum3 {
    public static int sum3(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum3(new int[] { 1, 2, 3 }));
        System.out.println(sum3(new int[] { 5, 11, 2 }));
        System.out.println(sum3(new int[] { 7, 0, 0 }));
    }
}