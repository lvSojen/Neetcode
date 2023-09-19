class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();
        int[] countArray = new int[256];

        for(int i = 0; i< charArray1.length; i ++) {
            countArray[charArray1[i]]++;
        }
        for(int i = 0; i< charArray2.length; i ++) {
            countArray[charArray2[i]]--;
        }

        for(int i =0; i < countArray.length; i++) {
            if(countArray[i] != 0) {
                return false;
            }
        }
        return true;
    }


}
