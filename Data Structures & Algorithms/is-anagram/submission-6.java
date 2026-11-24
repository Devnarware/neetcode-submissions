class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length() ;

        if(n != t.length()){
            return false; 
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) +1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) -1);
        }

        Collection<Integer> values = map.values();
       for(int val : values){
           if (val != 0) return false ;
       }

        return true;
    }
}
