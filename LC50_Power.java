public class LC50_Power {
    public static void main(String[] args) {
        double x = 2.0000;
        int n = 10;
        double ans = myPow(x, n);
        System.out.println(ans);
    }

    // private static double myPow(double x, int n) {
    //     double ans = 1;
    //     long N=n;
    //     if (n < 0) {
    //         x = 1 / x;
    //         N = -N;
    //     }
    //     if (x == 1)
    //         return ans;

    //     for (int i = 0; i < N; i++) {
    //         if (n == 0)
    //             return ans;
    //         else if (N < 0) {
    //             ans *= x;

    //         } else
    //             ans *= x;
    //     }
    //     return ans;
    // }
    private static double myPow(double x, int n) {
    long N = n; // convert to long to handle -2147483648 safely
    if (N < 0) {
    x = 1 / x;
    N = -N;
    }

    double ans = 1.0;
    while (N > 0) {
    if (N % 2 == 1) {
    ans *= x;
    }
    x *= x;
    N /= 2;
    }

    return ans;
    }

}
