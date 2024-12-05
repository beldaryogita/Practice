//Duplicate element remove from string 
import java.util.*;
class RemoveDuplicateFromString {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
       Set<Character> set=new LinkedHashSet<Character>();
       for(int i=0;i<str.length();i++){
           set.add(str.charAt(i));
       }
       StringBuffer sb= new StringBuffer();
       for(Character c: set){
           sb.append(c);
       }
       System.out.println(sb);
        
    }
}