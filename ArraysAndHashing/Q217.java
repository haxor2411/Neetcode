package ArraysAndHashing;

import java.util.HashSet;

public class Q217 {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums){
            if(!hs.contains(i)) hs.add(i);
            else return true;
        }

        return false;
    }
}
