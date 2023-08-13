import java.util.Scanner;
public class Algo_1{
    private final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        do{
        int num;
        do{System.out.print("Enter a number: ");
            num=scanner.nextInt();
            scanner.nextLine();
            if(num<0){System.out.println("PLease enter a positive number\n");}
        
        }while(num<0);
        
        
        String str1="Fibonachchi sequence is : 1,1,";
        if(num==0){
            System.out.printf("%s%s there is no any fibonachchi number to show",str1,"\b".repeat(4));
            System.out.println();
        }
        if (num==1){
            System.out.printf("%s\b ",str1);System.out.println();
    }
        int fibo1=1;
        int fibo2=1;
        int fibo=0;

        if (num>1){do {
            fibo=(fibo1)+(fibo2);
            if (fibo<=num){str1+=fibo+",";
            fibo2=fibo1;
            fibo1=fibo;
        }
        } while(fibo<num);
        System.out.printf("%s\b \n",str1);}
        System.out.println();}

        while(true);
        

    }

}












    
