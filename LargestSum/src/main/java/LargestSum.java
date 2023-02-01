
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestSum {
    /**
     * Get the largest possible sum that can be obtained from a pair of values in the list. A number can't be added
     * to itself, unless there are duplicates.
     *
     * @param nums a list of ints.
     * @return the largest possible sum of separate numbers from nums.
     */
    public int bigSum(List<Integer> nums){
        Collections.sort(nums, new Comparator<Integer>() {
 
            @Override
            public int compare(Integer i1, Integer i2) {
                return Integer.compare(i2, i1); // descending-order sorting
            }
        });
        int sum = 0;
 
 
        // summing first 2 largest numbers
        for(int index = 0; index < nums.size() && index < 2; index++) {
 
            sum += nums.get(index);
        }
        return sum;
    }
}