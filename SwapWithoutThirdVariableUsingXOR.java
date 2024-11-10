//Swap two numberswit using third variable approach 1.
class SwapWithoutThirdVariableUsingXOR {
    
    public static void main(String[] args) {
    int x=5;
    int y=6;
   
     System.out.println("before swapping");
   
     System.out.println(x);
      System.out.println(y);
    x=x^y;
    y=x^y;
    x=x^y;
    
      System.out.println("after swaping");
 
     System.out.println(x);
      System.out.println(y);
    
    }
}