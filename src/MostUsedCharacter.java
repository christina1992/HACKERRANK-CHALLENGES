import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by hnastevska on 4/5/2017.
 */
public class MostUsedCharacter {

    public static String mostUsed(String sentence) {
        HashMap<String, char[]> charMap = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();
        String[] words = sentence.split(" ");
        for (String word : words) {
            String wordCleaned = removeDuplicatesFromWord(word);
            charMap.put(wordCleaned, wordCleaned.toCharArray());
        }
        int j = 1;
        for (int i = 0; i < words.length; i++) {
            String cleanWord = removeDuplicatesFromWord(words[i]);
            char[] chars = charMap.get(cleanWord);
            for (char c : chars) {
                if (map.get(c) != null) {
                    map.put(c, map.get(c) + j);
                } else {
                    map.put(c, j);
                }
            }
        }
        //System.out.println(map);
        return returnCommenChar(map);
    }

    private static String returnCommenChar(HashMap<Character, Integer> map) {
        int max = 0;
        Character retchar = ' ';
        Collection<Character> keys = map.keySet();
        for (Character ch : keys) {
            int num = map.get(ch);
            if (num > max) {
                max = num;
                retchar = ch;
            }
        }
        return retchar.toString();
    }


    private static String removeDuplicatesFromWord(String word) {
        char[] chars = word.toCharArray();
        Set<Character> charSet = new LinkedHashSet<>();
        for (char c : chars) {
            charSet.add(c);
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : charSet) {
            sb.append(character);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(mostUsed("akjqq werj khhjjklqwerkjhkljqwherkjwheasdasdqweasdeas dasdqweqweqqqqqqqalksjdaeoi"));
    }
}
