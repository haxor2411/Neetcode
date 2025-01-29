package ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q347 {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums) hm.put(i, hm.getOrDefault(i, 0) + 1);

        @SuppressWarnings("unchecked")
        ArrayList<Integer>[] count = new ArrayList[n + 1];
        for(int i = 0; i < n + 1; i++) count[i] = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            count[entry.getValue()].add(entry.getKey());
        }

        int[] result = new int[k];
        for(int i = n; i >= 0 && k > 0; i--){
            if(count[i] != null){
                for(int j = 0; j < count[i].size(); j++){
                    result[k - 1] = count[i].get(j);
                    k--;
                    if(k == 0) break;
                }
            }
        }

        return result;
    }
}
