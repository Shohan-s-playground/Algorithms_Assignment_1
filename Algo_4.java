import java.util.Arrays;
public class Algo_4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        for(int i =0,r;i<(nums.length/2);i++){
            r=nums[i];
            nums[i]=nums[(nums.length-1)-i];
            nums[(nums.length-1)-i]=r;
        }

    System.out.println(Arrays.toString(nums));







    }
    
}
