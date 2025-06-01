public class LC125_Valid_Palindrome {
   public static void main(String[] args) {
      String s="A man, a plan, a canal: Panama";
      boolean b=isPalindrome(s);
      System.out.println(b);
   }
   private static boolean isPalindrome(String s){
      s=s.toLowerCase();
      StringBuilder sb=new StringBuilder();
      
      for(int i=0;i<s.length();i++){
         if(s.charAt(i)>=98 && s.charAt(i)<=122 || s.charAt(i)>= 48 && s.charAt(i) <=57 )
            sb.append(s.charAt(i));
      }
      for(int i=0;i<sb.length()/2;i++){
         if (sb.charAt(i)!=sb.charAt(sb.length()-1-i)) {
            return false;
         }
      }
      return true;
   }
}
