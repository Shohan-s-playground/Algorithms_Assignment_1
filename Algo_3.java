import java.util.Arrays;

public class Algo_3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        //System.out.println(nums);
        int q=nums.length;
        int[] nums2=new int[q];
        //System.out.println(nums2);
        for(int i=0;i<q;i++){
            nums2[i]=nums[(q-1)-i];
         }
        nums=nums2;
        System.out.println(Arrays.toString(nums));

    }
    
}
