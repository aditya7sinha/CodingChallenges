package LeetCode;

import java.util.*;

public class AnagramGroup {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0 || strs==null){
            return new ArrayList<>();
        }
        Map<String, List<String>> anagramGroup = new HashMap<>();

        for( String word:strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            if(anagramGroup.containsKey(key)){
                anagramGroup.get(key).add(word);
            } else {
                List<String> group = new ArrayList<>();
                group.add(word);
                anagramGroup.put(key, group);
            }
        }
        return new ArrayList<>(anagramGroup.values());
    }
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        AnagramGroup group = new AnagramGroup();
        group.groupAnagrams(words);
    }
}
