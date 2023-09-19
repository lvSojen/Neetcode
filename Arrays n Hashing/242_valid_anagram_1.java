class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for(int i=0; i< s.length(); i++) {
            char c = s.charAt(i);
            if(map1.containsKey(c)) {
                map1.put(c, map1.get(c) + 1);
            } else {
                map1.put(c,1);
            }
        }

        for(int i=0; i< t.length(); i++) {
            char c = t.charAt(i);
            if(map2.containsKey(c)) {
                map2.put(c, map2.get(c) + 1);
            } else {
                map2.put(c,1);
            }
        }

        return map1.equals(map2);
    }


}