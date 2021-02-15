package Boyer;

// Brute Force Algorithm for searching pattern in a string

public class BruteForceSearch {
    String text, pattern;
    int lengthOfPattern, lengthOfText;
    int count = 0;

    public BruteForceSearch(String text, String pattern) {
        this.text = text;
        this.pattern = pattern;
        lengthOfPattern = pattern.length();
        lengthOfText = text.length();
    }

    public void search() {

        for (int i = 0; i < lengthOfText - lengthOfPattern; i++) {
            int j;
            for (j = 0; j < lengthOfPattern; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == lengthOfPattern) {
                System.out.println("index " + i + " match the query sequence");
                count++;
            }
        }
        if (count < 1) {
            System.out.println("No occurrence");
        } else {
            System.out.println("Total number of occurrences : " + count);
        }
    }
}
