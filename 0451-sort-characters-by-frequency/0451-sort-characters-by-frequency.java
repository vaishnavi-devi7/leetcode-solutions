class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i = 0 ;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character>chars=new ArrayList<>(map.keySet());
        chars.sort((a,b)-> map.get(b)-map.get(a));
        StringBuilder result = new StringBuilder();

        for (char ch:chars){
            for(int i =0;i<map.get(ch);i++){
                result.append(ch);
            }

        }
        return result.toString();
    }
}