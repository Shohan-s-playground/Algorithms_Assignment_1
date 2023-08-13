import java.util.Scanner;

public class Algo_7 {
    private final static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
    
    do{
        String str1="The longest words are : ";
        String str2="The shortest words are : ";
        String input;
        do{
            System.out.println("Enter a text : ");
            input = scanner.nextLine().strip();
            if (input.isBlank()){System.out.println("Please enter a non blank text\n");}
            }while(input.isBlank()); 

    String [] words = input.split(" ");   
    int max=0;
    int count3=0;
    String wrd1="";
    loop1:
    for (int i=0,p=0;i<(words.length);i++){
        int count1=0;
        p=words[i].length();
        for(int r=0,q=0;r<(words.length);r++){
            q=words[r].length();
            if(p<q){continue loop1;}
            count1++;
        if (count1==words.length){count3++;wrd1=words[i];str1+=words[i]+",";max=p;}  
        }
            
    }
    
    
    
    int least=0;
    int count4=0;
    String wrd2="";
    loop2:
    for (int a=0,c=0;a<(words.length);a++){
        int count2=0;
        c=words[a].length();
        for(int b=0,d=0;b<(words.length);b++){
            d=words[b].length();
            if(c>d){continue loop2;}
            count2++;
        if (count2==words.length){count4++;wrd2=words[a];str2+=words[a]+",";least=c;}    
        }
           
        
    }
    System.out.println();
    if(count3==1){
            System.out.printf("The longest word is : %s\n",wrd1);
            System.out.printf("The size of the longest word is : %s\n",max);}

    if(count3>1){
        System.out.printf("%s\b \n",str1);
        System.out.printf("The size of the longest word is : \b%s\n",max);}
    
        System.out.println();

    if(count4==1){
            System.out.printf("The shortest word is : %s\n",wrd2);
            System.out.printf("The size of the shortest word is : %s\n",least);}

    if(count4>1){
        System.out.printf("%s\b \n",str2);
        System.out.printf("The size of the shortest word is : \b%s\n",least);}
    
        System.out.println();


    }while(true);







        
    }
    
}
