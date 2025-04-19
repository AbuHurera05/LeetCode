public class EvenDigit_LC1295{
    public static void main(String arg[]){

        int[] x= {152,-41,123,514,30987,230876,12};
        System.out.println(findEvenNumber(x));
        System.out.println();
    }
    private static int findEvenNumber(int[] nums){
        int count=0;
        for(int num: nums){
            if(digits(num))
            count++;

        }
        return count;
    }
    private static boolean digits(int x){
        if(x<0)
            x *=-1;
        int num=0;
        while (x>0) {
            x=x/10;
            num++;

        }
        return num%2==0;
        

    }


}