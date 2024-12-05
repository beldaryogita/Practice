
import java.util.*;
class Main {
    public static void main(String[] args) {
        int[] arr={1,5,9,6,0,3,3};
        int size=arr.length;
        int[] res=new int[size];
        int t=6;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=arr[i]+arr[j];
                if(sum==t){
                    res[i]=i;
                    res[j]=j;
                }
            }
        }
        System.out.println(Arrays.toString(res));
       
    }
}