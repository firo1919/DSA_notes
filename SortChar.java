import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SortChar {
    public static void main(String[] args) {
        
    }
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        Map<Integer, ArrayList<Character>> count = new HashMap<>();
        StringBuilder ss = new StringBuilder();
        
        for (int index = 0; index < s.length(); index++) {
            freq.put(s.charAt(index), freq.getOrDefault(s.charAt(index), 0)+1);
        }
        
        for (Map.Entry<Character,Integer> entry : freq.entrySet()) {
            int frequency = entry.getValue();
            char character = entry.getKey();

            count.putIfAbsent(frequency, new ArrayList<>());
            count.get(frequency).add(character);
        }
        
        for (int j = s.length(); j > 0; j--) {
              if (count.get(j)!=null) {
                for (Character l : count.get(j)) {
                    int i = j;
                    while (i>0) {
                        ss.append(l);
                        i--;
                    }
                }          
            }
        }
        return ss.toString();
    }

}
