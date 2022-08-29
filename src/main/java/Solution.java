import java.util.*;

public class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
    if (strs.length == 1) {
      return List.of(List.of(strs[0]));
    }
    HashMap<List<Integer>, List<String>> hash = new HashMap<>();
    List<List<String>> result = new ArrayList<>();
    for (String input : strs) {
      List<Integer> key = countAnagram(input);
      List<String> list = new ArrayList<>();
      if (hash.containsKey(key)) {
        list = hash.get(key);
      }
      list.add(input);
      hash.put(key, list);
    }
    Set<Map.Entry<List<Integer>, List<String>>> entrySet = hash.entrySet();

    for (Map.Entry<List<Integer>, List<String>> pair: entrySet) {
      result.add(pair.getValue());
    }
    return result;
  }
  public List<Integer> countAnagram(String input) {
    List<Integer> charFreq = new ArrayList<>();
    int sLen = input.length();
    // init each character count = 0
    for (int pos = 0; pos < 26;pos++) {
      charFreq.add(0);
    }
    // calculate each input pos freq
    for (int pos = 0; pos < sLen; pos++) {
      char ch = input.charAt(pos);
      int charIdx = ch - 'a';
      charFreq.set(charIdx, charFreq.get(charIdx)+1);
    }
    return charFreq;
  }
}
