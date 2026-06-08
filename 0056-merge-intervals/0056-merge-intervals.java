import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {

        if(intervals.length<=1) return intervals;

        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);

        List<int[]> result = new ArrayList<>();
        int[] curInterval= intervals[0];
        result.add(curInterval);
        
        for(int[] interval : intervals){

            if(curInterval[1]>=interval[0]){// = bcoz equal hua start end to bhi overlap
            //overlapping interval; expand curInterval's end to next if greater.
            curInterval[1] = Math.max(curInterval[1], interval[1]);
         }
        else {
            //no overlap mtlb naya interval banega aur usse check krege
            curInterval = interval;//update the last inetrval prev wale ko chod diya ab
            result.add(curInterval); // new wale s check and no overlap
        }

        }
        return result.toArray(new int[result.size()][]);

    }
}