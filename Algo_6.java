import java.util.Scanner;

public class Algo_6 {
    private final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
    String input;   
    do{
        do{
        System.out.println("Enter a text : ");
        input = scanner.nextLine().strip();
        if (input.isBlank()){System.out.println("PLease enter a non blank text\n");}
        }while(input.isBlank());

        String [] words = input.split(" ");
        int len=words.length;
        String r;

        for (int i=0;i<len/2;i++){
            r=words[i];
            words[i]=words[(len-1)-i];
            words[(len-1)-i]=r;
        }

        for (int p=0;p<len;p++){
            System.out.printf("%s ",words[p]);

        }
        System.out.println();
        System.out.println();

    }while(true);
}
}