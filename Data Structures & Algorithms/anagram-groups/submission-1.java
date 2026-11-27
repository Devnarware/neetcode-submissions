class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> list =new ArrayList<>();

       Map<String, List<String>> map = new HashMap<>();

       for(String str : strs){
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String key = new String(ch) ;
        if(map.containsKey(key)){
            map.get(key).add(str) ;
        }else{
            map.put(key, new ArrayList<>());
            map.get(key).add(str) ;
        }

       }

        for(Map.Entry<String, List<String>> e : map.entrySet()){
            list.add(e.getValue()) ;
        }

        return list;
    } 
}
