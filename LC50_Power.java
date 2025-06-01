public class LC50_Power {
   public static void main(String[] args) {
      double x=2.0000;
      int n=-2;
      double ans=myPow(x,n);
      System.out.println(ans);
   }
   private static double myPow(double x, int n){
      double ans=1;
      if(n<0){
         x=1/x;
         n=n*-1;
      }
      // double newx= 1/x;
      // int p =Math.abs(n);
      for(int i=0; i<n;i++){
         if(n==0)
            return ans;
         else if(n<0){
            ans*=x;
            
         }
         else
            ans*=x;
      }
      return ans;
   }
}
