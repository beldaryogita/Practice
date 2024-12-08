//Swap two numberswit using third variable approach 1.
class SwapWithoutThirdVariableUsingMultiplicationAndDivision {
    
    public static void main(String[] args) {
    int x=5;
    int y=6;
   
     System.out.println("before swapping");
   
     System.out.println(x);
      System.out.println(y);
    x=x*y;//30
    y=x/y;//30/6=5
    x=x/y;//30/5
    
      System.out.println("after swaping");
 
     System.out.println(x);
      System.out.println(y);
    
    }
}