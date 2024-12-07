class FindTargetInArray {
    public static void main(String[] args) {
       int[] arr={4,5,6,7,0,1,2,3};
       int target=9;
       boolean b=false;
       int index=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i]==target){
               b=true;
               index=i;
           }
           
       }
       if(b==true){
           System.out.println(index);
       }
       else{
           System.out.println("-1");
       }
    }
}