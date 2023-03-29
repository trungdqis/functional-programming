package techniques;

public class TailCallOptimization {

    public static void main(String[] args) {

    }

    private static long reFact(int n) {
        if (1 >= n) {
            return 1;
        } else {
            return n * reFact(n - 1);
        }
    }

    private static long tailReFact(int n, int a) {
        if (1 >= n) {
            return 1;
        } else {
            return tailReFact(n - 1, n * a);
        }
    }
}
