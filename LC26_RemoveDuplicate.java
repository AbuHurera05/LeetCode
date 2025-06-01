public class LC26_RemoveDuplicate {

    public static void main(String[] args) {
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        int a= removeDuplicate(arr);
        System.err.println(a);
    }
    private static int removeDuplicate(int[]nums){
        if (nums.length<=1) {
            return nums.length;
        }
        int index=1;
        for(int i=1;i<nums.length;i++){
            if (nums[i] != nums[index-1]) {
                nums[index]=nums[i];
                index++;
            }
        } 
        return index;
    }
}