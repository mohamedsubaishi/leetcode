class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();
        for(String sh:strs)
        {
            char[] ch=sh.toCharArray();
            Arrays.sort(ch);
            String s=new String(ch);
            if(!map.containsKey(s))
            {
                map.put(s,new ArrayList<>());
            }
            map.get(s).add(sh);
        }
        return new ArrayList<>(map.values());
    }
}