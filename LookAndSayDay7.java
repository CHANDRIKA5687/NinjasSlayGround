package ninjaslayground;
public class LookAndSayDay7 {
    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        for (int n : input) {
            System.out.println(lookAndSaySequence(n));
        }
    }

    public static String lookAndSaySequence(int n) {
        if (n <= 0) {
            return "";
        }

        String currentTerm = "1";
        
        for (int i = 2; i <= n; i++) {
            currentTerm = generateNextTerm(currentTerm);
        }

        return currentTerm;
    }

    public static String generateNextTerm(String term) {
        StringBuilder result = new StringBuilder();
        char currentDigit = term.charAt(0);
        int count = 1;

        for (int i = 1; i < term.length(); i++) {
            if (term.charAt(i) == currentDigit) {
                count++;
            } else {
                result.append(count).append(currentDigit);
                currentDigit = term.charAt(i);
                count = 1;
            }
        }

        result.append(count).append(currentDigit);
        return result.toString();
    }
}