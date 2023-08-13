public class Algo_2 {
    public static void main(String[] args) {
        int[] nums={-5, 2, 7, 10, 58, -7, 8, 23};
        int i=0;
        int p=0;
        loop1:
        for (;i<(nums.length);i++){
            for(int r=0;r<(nums.length);r++){
                if(nums[i]<nums[r]){continue loop1;}
                
            }
            System.out.printf("The highest number is : %s\n",nums[i]);
        }


        loop2:
        for (;p<(nums.length);p++){
            for(int q=0;q<(nums.length);q++){
                if(nums[p]>nums[q]){continue loop2;}
                
            }
            System.out.printf("The lowest number is : %s\n",nums[p]);
        
        }
        






    }
    
}
