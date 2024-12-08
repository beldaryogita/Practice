
import java.util.*;
class HighcharOccuringInString {
   
   public static char highcharoccuring(String str){
       int[] arr=new int[256];
       for(int i=0;istr.length();i++){
           arr[str.charAt(i)]+=1;
          
       }
       int max=-1;
       char c=' ';
       for(int i=0;istr.length();i++){
           if(maxarr[str.charAt(i)]){
               max=arr[str.charAt(i)];
               c=str.charAt(i);
           }
       }
       return c;
      
   }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter string");
       String str=sc.nextLine();
       char result=HighcharOccuringInString.highcharoccuring(str);
       System.out.println(result);
       
   }
}