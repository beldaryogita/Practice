
import java.util.*;
class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string with . ");
        String input=sc.nextLine();
        String result="";
        
        for(int i=0;i<=input.length()-1;i++){
            int count =0;
            for(int j=i+1;j<input.length();j++){
                if(input.charAt(i)==input.charAt(j)){
                   count++;
                }
            }
            if(count==0){
                       result+=input.charAt(i);
                       break;
                   }
        }
     System.out.println(result);
    }
}