//Write a Java Program to find the Factorialof given number.
class FactorialWithoutRecursion {
    public static int factorial(int n){
        int result =1;
    for(int i=1;i<=n;i++){
       result*=i;
        
    }
    return result;
    }
    public static void main(String[] args) {
    int n=5;
     
     System.out.println(factorial(n));
    
    }
}