import java.util.Arrays;

public class LC283_Move_Zeroes {
   public static void main(String[] args) {
      int nums[]={0,1,0,3,12};
      System.out.println(Arrays.toString(nums));
      movesZeroes(nums);
      System.out.println(Arrays.toString(nums));
   }
   private static void movesZeroes(int nums[]){
      int position=0;
      for(int i=0;i<nums.length;i++){
         if(nums[i]!=0){
            nums[position]=nums[i];
            position++;
         }
      }
      while (position<nums.length) {
         nums[position++]=0;
         
      }

   }
}
