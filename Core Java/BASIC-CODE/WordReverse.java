
import java.util.*;
class wordReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string with . ");
        String input=sc.nextLine();
        String[] word=input.split("\\.");
        String result="";
       for(int i=word.length-1;i>=0;i--){
          result+=word[i];
          if(i!=0){
              result+=".";
          }
       }
        //System.out.println();
       System.out.println(result);
    }
}