import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String inputSentence = "The quick brown fox jumps over the lazy dog";
        boolean result = isPangram(inputSentence);
        if (result) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        Set<Character> alphabet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabet.add(c);
        }
        Set<Character> sentenceSet = new HashSet<>();
        for (char c : sentence.toLowerCase().toCharArray()) {
            sentenceSet.add(c);
        }
        return alphabet.containsAll(sentenceSet);
    }
}

