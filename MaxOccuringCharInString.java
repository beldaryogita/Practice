//How to find the maximum occurring character in a given String?
import java.util.*;
class MaxOccuringCharInString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
      String s=sc.nextLine();
      int count=0;
      char s1='\0';
      for(int i=0;i<s.length()-1;i++){
          for(int j=i+1;j<s.length()-1;j++){
              if(s.charAt(i)==s.charAt(j)){
                
                 s1=s.charAt(i);
                  
              }
             
          }
          
      }
     
       System.out.println(s1);
    
    }
}