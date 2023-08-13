import java.util.Scanner;

public class Algo_9 {
    private final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
    
    do{
    String input;
    boolean flag1=true;
    boolean flag2=true;
    
    
    do{
        System.out.println("Enter a word : ");
        input = scanner.nextLine().strip();
        flag1=input.isBlank();
        if (flag1){System.out.println("Please enter a non blank text\n");}
        String [] words = input.split(" ");
        flag2=words.length>1;
        if (flag2){System.out.println("You entered a sentence or multiple words,Please enter a single word\n");}
        }while(flag1|flag2);

        char[] chars=input.toCharArray();

        int len=chars.length;
        boolean flag3=false;
        for (int i=0;i<len/2;i++){
            flag3=chars[i]!=chars[(len-1)-i];
            if(flag3){
            System.out.println("This is not a palindrome word.");
            break;}
        }
        if(!flag3){System.out.println("This is a palindrome word.");}
        System.out.println();
       
    }while(true);







    }
    
}
