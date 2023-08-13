import java.util.Scanner;

public class Algo_10 {
    private final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
    String input;
    boolean flag1=true;
    boolean flag2=true;
    boolean flag3=true;
    
    do{
        System.out.println("Enter your telephone number: ");
        input = scanner.nextLine().strip();
        flag1=input.isBlank();
        if (flag1){System.out.println("Telephone number can't be empty,");}
        if(input.startsWith("+94")){
            String str1=input.substring(3,input.length()).strip();
            String [] words = str1.split(" ");
            if(words.length>1){
            for(int i=0;i<words.length;i++){
                char[] ele=words[i].toCharArray();
                int q=ele.length;
                for(int r=0;r<q;r++){
                    flag2=!Character.isDigit(ele[r]);
                    if (flag2){System.out.println("Invalid phone number.");break;}
                }
                if(flag2){break;}
                
            }
            if(!flag2){System.out.println("Number is validated.");System.out.println();}
            }
            else{System.out.println("Invalid phone number.");System.out.println();}
        }

        if(input.startsWith("0")){
            String str2=input.substring(1,input.length()).strip();
            if(str2.charAt(2)=='-'){
            String [] words = str2.split("-");
            char[] ele1=words[0].toCharArray();
            if (!Character.isDigit(ele1[0])||!Character.isDigit(ele1[1])){System.out.println("Invalid phone number.");break;}
            String [] words2 = words[1].split(" ");
            for(int i=0;i<words2.length;i++){
                char[] ele2=words2[i].toCharArray();
                int q=ele2.length;
                for(int r=0;r<q;r++){
                    flag3=!Character.isDigit(ele2[r]);
                    if (flag3){System.out.println("Invalid phone number.");break;}
                }
                if(flag3){break;}
                
            }
            if(!flag3){System.out.println("Number is validated.");System.out.println();}
        }
        else{System.out.println("Invalid phone number.");System.out.println();}
        }
        
        
    }while(true);

    
        
    }
    
}
