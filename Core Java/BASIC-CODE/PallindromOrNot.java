

class PallindromOrNot {
    public static void main(String[] args) {
        
       int number=-121;
       int original=number;
       int module=0;
       int sum=0;
       if(number<0){
            System.out.println("not pallindrom");
       }
       else{
       
       while(number!=0){
            module=number%10;
            sum=(sum*10)+module;
           number=number/10;
           
           
       }
       if(original==sum){
           System.out.println("pallindrom");
       }
       else{
           System.out.println("not pallindrom");
       }}
    }
}