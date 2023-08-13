import java.util.Arrays;

public class Algo_3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        int q=nums.length;
        int[] nums2=new int[q];
        for(int i=0;i<q;i++){
            nums2[i]=nums[(q-1)-i];
         }
        nums=nums2;
        System.out.println(Arrays.toString(nums));

    }
    
}
