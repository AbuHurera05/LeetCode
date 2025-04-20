public class LC231_PowerOfTwo {

    public static void main(String[] args) {
        int n=-160;
        boolean b=isPowerOfTwo(n);
        System.out.println(b);
    }
    private static boolean isPowerOfTwo(int n){
        if (n==1) {
            return true;
        }
        if (n < 1) {
            return false;
        }
        if (n%2 != 0) {
            return false;
        }
        return isPowerOfTwo(n/2);
    }
}