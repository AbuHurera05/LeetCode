public class EvenDigit_LC1295_2 {
    public static void main(String[] args) {
        int [] x={152,123,514,30987,230876,12};
        System.out.println(findEvenNumber(x));
        System.out.println();
    }
    public static int findEvenNumber(int[] nums){
        int count=0;
        for(int num: nums){
            boolean b=even(num);
            if (b)
                count++;
            
        }
        return count;
    }
    private static boolean even(int num){
        String s= Integer.toString(num);
        if(s.length()%2==0)
            return true;
        else
            return false;
    }
}
