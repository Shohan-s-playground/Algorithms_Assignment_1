import java.util.Arrays;

public class Algo_8 {
    public static void main(String[] args) {

        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};
        String str="[";
        
        for(int i=0;i<numA.length;i++){
            for(int r=0;r<numB.length;r++){
                if(numA[i]==numB[r]){str+=numA[i]+",";}
            }
        }
        System.out.printf("numA \u2229 numB : %s\b]\n",str);

        int allLen=numA.length+numB.length;
        int[] arr1=new int[allLen];

        for (int p=0;p<numA.length;p++){
            arr1[p]=numA[p];
        }

        for(int q=0;q<numB.length;q++){
            arr1[q+7]=numB[q];
        }

        System.out.printf("numA \u222A numB : %s\n",Arrays.toString(arr1));

        int len1=numA.length;
        int[] arr2=new int[len1];
        int c=1;
        
        for(int b=0;b<numB.length;b++){
            c*=numB[b];
        }  

        for(int a=0;a<numA.length;a++){
            int d=0;
            d=numA[a]/c;
            arr2[a]=d;
            }

        System.out.printf("numA / numB : %s\n",Arrays.toString(arr2));

        int len2=numB.length;
        int[] arr3=new int[len2];
        int e=1;
        
        for(int a=0;a<numB.length;a++){
            e*=numA[a];
        }  

        for(int b=0;b<numA.length;b++){
            int f=0;
            f=numB[b]/e;
            arr3[b]=f;
            }

        System.out.printf("numB / numA : %s\n",Arrays.toString(arr3));

        




    }
    
}
