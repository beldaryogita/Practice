
import java.util.*;
class QuickSort {
    public static void quick(int[] arr,int low, int high){
        if(low<high){
        int pi=partition(arr,low,high);
        quick(arr,low,pi-1);
        quick(arr,pi+1,high);
        }  } 
        public static int partition(int[] arr,int low ,int high){
            int pivote=arr[high];
            int i=low-1;
            for(int j=low;j<high;j++){
                if(arr[j]<pivote){
                    i++;
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            i++;
            int temp=arr[i];
            arr[i]=arr[high];
            arr[high]=temp;
            return i;
        }
    
    public static void main(String[] args) {
      int[] arr={25,5,1,9,8};
      int low=0;
      int high=arr.length-1;
      quick(arr,low,high);
      System.out.println(Arrays.toString(arr));
      
    }
}