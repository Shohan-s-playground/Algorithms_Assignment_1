import java.util.Scanner;

public class Algo_5 {
    private final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        String input;

    do{
        do{
            System.out.println("Enter a text : ");
            input = scanner.nextLine().strip();
            if (input.isBlank()){System.out.println("PLease enter a non blank text\n");}
        }while(input.isBlank());
            
    char[] chars=input.toCharArray();
    int len=chars.length;
    char r;
    for (int i=0;i<len/2;i++){
        r=chars[i];
        chars[i]=chars[(len-1)-i];
        chars[(len-1)-i]=r;
    }
    for (int p=0;p<len;p++){
        System.out.print(chars[p]);
    }
    System.out.println();
    System.out.println();

}while(true);





        
    }
    
}
