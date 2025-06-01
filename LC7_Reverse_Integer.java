public class LC7_Reverse_Integer {
   public static void main(String[] args) {
      int x = 1534236469;
      int ans = reverse(x);
      System.out.println(ans);
   }

   private static int reverse(int x) {
      int ans = 0;
      while (x != 0) {

         int mod = x % 10;
         if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && mod > 7)) {
            return 0; // overflow case for positive int
         }
         if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && mod < -8)) {
            return 0; // overflow case for negative int
         }
         ans = ans * 10 + mod;
         x = x / 10;
      }
      return ans;
   }
}
