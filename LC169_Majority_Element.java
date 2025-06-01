public class LC169_Majority_Element {
   public static void main(String[] args) {
      int nums[]={3,2,3,4,4,5,5,5,5};
      int ans=majorityElement(nums);
      System.out.println(ans);
   }
   private static int majorityElement(int nums[]){
      int ans=0;
      int count=0;
      for(int i=0;i<nums.length;i++){
         if(count==0)
            ans=nums[i];
         else if(ans==nums[i])
            count++;
         else
            count--;

      }
      return ans;
   }
   
}
