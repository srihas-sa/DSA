// Sorting 
// =====

// Merge Sort
//Initial ==> used Multiple ArrayLists to store Left and right sub arrays
//Memeory ==> high 

//Time Complexity ==> if it id divided liks n/2 then time complexity will be log2(n)
//Dividing ==> log(n) +  merging ==>  O(N) ===> O(n log(n));
//Space Complexity ==> O(N)


class Solution {
    public int[] sortArray(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);

        }
        int result[]=new int[nums.length];
        ArrayList<Integer> res=recursion(arr);
        for(int i=0;i<res.size();i++){
            result[i]=res.get(i);

        }
        return result;

    }

    public static ArrayList<Integer> sorted(ArrayList<Integer> l1,ArrayList<Integer> l2){
    ArrayList<Integer> ret=new ArrayList<Integer>();
    int i=0;
    int j=0;
    for(int j1=0;j1<(l1.size()+l2.size());j1++){
      
    
      if(i>=l1.size()){
        ret.add(l2.get(j));
        j=j+1;
      }
      
      else if(j>=l2.size()){
        ret.add(l1.get(i));
        i=i+1;
      }
      
      else if(l1.get(i)<=l2.get(j)){
        ret.add(l1.get(i));
        i=i+1;
      }
      else if(l1.get(i)>l2.get(j)){
        ret.add(l2.get(j));
        j=j+1;
      }
      
  }
  
  return ret;
  
  }public static ArrayList<Integer> recursion(ArrayList<Integer> arr){
    if(arr.size() <=1){
      return arr;
    }
    int mid=(arr.size())/2;
     ArrayList<Integer> l1 = new ArrayList<>(arr.subList(0, mid));
        ArrayList<Integer> l2 = new ArrayList<>(arr.subList(mid, arr.size()));
        
        l1 = recursion(l1);
        l2 = recursion(l2);
    ArrayList<Integer> res=new ArrayList<>(sorted(l1,l2));
    return res;
  }
}

//Final ==> used just index and removed array list saves storage
import java.util.ArrayList;

public class MainClass {
  
  
  public static void Merge(ArrayList<Integer> arr,int start,int mid,int end){
    int i=start;
    int j=mid+1;
    ArrayList<Integer> temp=new ArrayList<Integer>();
    
    while(i<= mid && j<=end){
      if(arr.get(i)<arr.get(j)){
        temp.add(arr.get(i));
        i=i+1;
      }
      
      if(arr.get(i)>arr.get(j)){
        temp.add(arr.get(j));
        j=j+1;
      }
    }
    
    while(i<=mid){
      temp.add(arr.get(i));
      i=i+1;
    }
    
    while(j<=end){
      temp.add(arr.get(j));
      j=j+1;
        
    }
    
    for (int k = start; k <= end; k++) {
    arr.set(k, temp.get(k - start));
    }

    
    
  }
  public static void divide(ArrayList<Integer> arr,int start,int end){
    if(start>=end){
      return ;
    }
    
    int mid=(start+end)/2;
    divide(arr,start,mid);
    divide(arr,mid+1,end);
    Merge(arr,start,mid,end);
    System.out.println(arr);
  }
  
  
  public static void main(String[] args) {
  ArrayList<Integer> arr=new ArrayList<Integer>();
  arr.add(1);
  arr.add(4);
  arr.add(3);
  arr.add(0);
  arr.add(2);
  divide(arr,0,arr.size()-1);
  
  }
}



