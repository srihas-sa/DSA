//Quick Sort
//Time Complexity  ==>O(n Log(n));
//Space Complexity ==>O(N);
import java.util.*;
public class Solution{
    
    public static int Quicksort(ArrayList<Integer> arr,int start,int end){
        
        int i=start;
        int j=end;
        while(i<j){
            if(arr.get(i)>arr.get(start) && (arr.get(start)>arr.get(j))){
                Integer temp=new Integer(arr.get(i));
                arr.set(i,arr.get(j));
                arr.set(j,temp);
                i=i+1;
                j=j-1;
            }
            
            if(arr.get(i) <= arr.get(start)){
                i=i+1;
            }
            if(arr.get(j) >= arr.get(start)){
                j=j-1;
            }
            
        }
        Integer temp1=new Integer(arr.get(start));
        arr.set(start,arr.get(j));
        arr.set(j,temp1);
        
        return j;
        
        
        
    }
public static void divide(ArrayList<Integer> arr,int start,int end){
      if(start<end){
        int pivot =Quicksort(arr,start,end);
        divide(arr,start,pivot-1);
        divide(arr,pivot+1,end);
      }
    }
    public static void main(String args[]){
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(1);
        arr.add(4);
        arr.add(3);
        arr.add(0);
        arr.add(2);
        divide(arr,0,arr.size()-1);
        System.out.println(arr);
    }
}
