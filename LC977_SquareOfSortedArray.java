import java.util.Arrays;

// public class LC977_SquareOfSortedArray {
//     public static void main(String[] args) {
//         int[] arr={-7,-3,2,3,11};
//         int[] arr2= sortedSquares(arr);
//         System.out.println(Arrays.toString(arr2));
//     }
//     private static int[] sortedSquares(int[] nums) {
//         int j=0;
//         for (int i : nums) {
//             nums[j]=i*i;
//             j++;
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }
public class LC977_SquareOfSortedArray {
    public static void main(String[] args) {
        int[] arr={-7,-3,2,3,11};
        int[] arr2= sortedSquares(arr);
        System.out.println(Arrays.toString(arr2));
    }
    private static int[] sortedSquares(int[] nums) {
        int left=0,right=nums.length-1;
        int arr[]=new int[nums.length];
        int i=nums.length-1;
        while (left<=right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                arr[i]=nums[left]*nums[left];
                left++;
            }
            else{
                arr[i]=nums[right]*nums[right];
                right--;
            }
            i--;
        }
        return arr;
    }
}

