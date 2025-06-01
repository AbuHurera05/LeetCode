import java.util.Arrays;

public class LC344_Reverse_String {
   public static void main(String[] args) {
      char ch[]={'h','e','l','l','o'};
      rverseString(ch);
      System.out.println(Arrays.toString(ch));
   }
   private static void rverseString(char [] s){
      int start=0;
      int end=s.length-1;
      while (start<end) {
         char temp= s[start];
         s[start]=s[end];
         s[end]=temp;
         start++;
         end--;
      }
      
   }
}
