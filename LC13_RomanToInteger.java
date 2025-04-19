import java.util.HashMap;
import java.util.Map;

public class LC13_RomanToInteger {
    public static void main(String[] args) {
        String s1="LIV";
        int a=romanToInt(s1);
        System.out.println(a);
    }
    private static int romanToInt(String s){
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        char ch[]=s.toCharArray();
        int j,i,sum=0;
        for(i=0,j=1;j<ch.length;i++,j++){
            
            if (map.get(ch[i]) >= map.get(ch[j])) {
                sum+=map.get(ch[i]);
                
            }
            else{
                sum-=map.get(ch[i]);
            }
            
        }
        sum+=map.get(ch[i]);
        return sum;
    }
}
