// Merge overlapping intervals
package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIterval {
    public static int[][] merge(int[][] intervals){
        ArrayList<int[]>output=new ArrayList<>();
        output.add(intervals[0]);
        for(int[] interval:intervals){
            int start=interval[0];
            int end=interval[1];
            int last=output.get(output.size()-1)[1];
            if(last>=start){
                output.get(output.size()-1)[1]=Math.max(end,last);
            }else{
                output.add(new int[]{start,end});
            }
        }
        return output.toArray(new int[0][0]);
    }

    public static void main(String[] args) {
       int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};
        int[][] result = merge(intervals);
        
        // Print merged intervals
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
    
}
