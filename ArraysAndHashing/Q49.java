package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String s : strs){
            int[] freqCount = new int[26];
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                freqCount[ch - 'a']++;
            }
            String key = Arrays.toString(freqCount);
            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(s);
        }

        return new ArrayList<>(hm.values());
    }
}
