import java.util.HashMap;

public class Main {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanDict = new HashMap<>();
        romanDict.put('I', 1);
        romanDict.put('V', 5);
        romanDict.put('X', 10);
        romanDict.put('L', 50);
        romanDict.put('C', 100);
        romanDict.put('D', 500);
        romanDict.put('M', 1000);
        
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && romanDict.get(s.charAt(i)) > romanDict.get(s.charAt(i - 1))) {
                result += romanDict.get(s.charAt(i)) - 2 * romanDict.get(s.charAt(i - 1));
            } else {
                result += romanDict.get(s.charAt(i));
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        String romanNumeral = "X";
        int integerValue = romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is: " + integerValue);
    }
}

