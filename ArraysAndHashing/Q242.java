package ArraysAndHashing;
public class Q242 {
    public boolean isAnagram(String s, String t) {
        int[] freqCount = new int[26];
        for(int i = 0; i < s.length(); i++){
            freqCount[s.charAt(i) - 'a']++;
        }

        for(int i = 0; i < t.length(); i++){
            freqCount[t.charAt(i) - 'a']--;
        }

        for(int i : freqCount) if(i != 0) return false;
        return true;
    }
}
