public class EvenDigit_LC1295_3 {
    public static void main(String[] args) {
        int [] x={152,-41,123,514,30987,230876,12};
        System.out.println(findEvenNumbers(x));
        System.out.println();
    }

    private static int findEvenNumbers(int[] nums){
        int count=0;
        for(int num:nums){
            int x=(int)(Math.log10(num)+1);
            if(x%2==0)
                count++;
        
        }
        return count;
    }
}
