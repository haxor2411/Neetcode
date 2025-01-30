package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0; i < n; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = n - 1;
            while(l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum > 0) r--;
                else if(sum < 0) l++;
                else {
                    List<Integer> tmp = new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r]));
                    result.add(tmp);
                    l++;
                    r--;
                    while(nums[l] == nums[l - 1] && l < r) l++;
                }
            }
        }

        return result;
    }
}
