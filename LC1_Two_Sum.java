import java.util.HashMap;
public class LC1_Two_Sum {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,11,9};
        int target=8;
        int ans[]= sum(arr, target);
        System.out.println(ans[0]+","+ans[1]);
        
    }
    private static int[] sum(int[] arr,int target){
        HashMap <Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            int value=target-arr[i];
            if (map.containsKey(value)) {
                return new int[] {map.get(value),i};
            }
            else{
                map.put(arr[i], i);
            }
        }
        return new int[] {-1,-1};
    }
}
