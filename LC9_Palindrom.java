public class LC9_Palindrom {
    public static void main(String[] args) {
        int num=123454321;
        boolean a=palindrom(num);
        System.out.println(a);
    }
    private static boolean palindrom(int num){
        if (num<0) {
            return false;
        }
        String str=Integer.toString(num);
        for(int i=0;i<str.length()/2;i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i)) {
                return false;
            }

        }
        return true;
    }
}
