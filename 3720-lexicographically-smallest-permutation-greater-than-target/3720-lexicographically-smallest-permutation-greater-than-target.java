class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] counts = new int[26];
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        
        int n = s.length();
        int maxMatch = 0;
        int[] tempCounts = counts.clone();
        
        for (int i = 0; i < n; i++) {
            int c = target.charAt(i) - 'a';
            if (tempCounts[c] > 0) {
                tempCounts[c]--;
                maxMatch++;
            } else {
                break;
            }
        }
        
        for (int i = Math.min(n - 1, maxMatch); i >= 0; i--) {
            int[] avail = counts.clone();
            
            for (int j = 0; j < i; j++) {
                avail[target.charAt(j) - 'a']--;
            }
            
            int targetChar = target.charAt(i) - 'a';
            int nextChar = -1;
            for (int c = targetChar + 1; c < 26; c++) {
                if (avail[c] > 0) {
                    nextChar = c;
                    break;
                }
            }
            
            if (nextChar != -1) {
                StringBuilder sb = new StringBuilder();
                
                sb.append(target.substring(0, i));
                
                sb.append((char) (nextChar + 'a'));
                avail[nextChar]--;
                
                for (int c = 0; c < 26; c++) {
                    while (avail[c] > 0) {
                        sb.append((char) (c + 'a'));
                        avail[c]--;
                    }
                }
                
                return sb.toString();
            }
        }
        
        return "";
    }
}