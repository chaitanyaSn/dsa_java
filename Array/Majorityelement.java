package Array;
// Find the majority element in an array an element that appears more than n/2 times).

import java.util.HashMap;
import java.util.Map;

public class Majorityelement {
    public static int major(int arr[]){
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i,0 )+1);
          
        }
        int n=arr.length;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()>n/2){
                return entry.getKey();
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
    
}
