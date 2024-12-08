//Write a Java Program to find the Factorialof given number. using recursion
class FactorialByRecuraion{
    public static int factorial(int n){
    if(n==0){
        return 1;
    }
    else if(n==1){
        return 1;
        
    }
    else{
        return n*factorial(n-1);
    }
    }
    public static void main(String[] args) {
    int n=5;
     
     System.out.println(factorial(n));
    
    }
}