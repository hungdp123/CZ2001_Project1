package Boyer;

public class SearchBoyer {
    int TOTAL_CHARS = 256;
    int[] misMatch = new int[TOTAL_CHARS];
    char[] text;
    char[] pattern;

    public SearchBoyer(char[] text, char[] pattern) {
        this.text = text;
        this.pattern = pattern;
        preProcessing(pattern, pattern.length);
    }

    //bad character heuristic (preprocessing)

    private void preProcessing(char[] str, int size) {

        // Initialize all variables as -1 in the array
        for (int i = 0; i < TOTAL_CHARS; i++)
            misMatch[i] = -1;

//      Store the last occurrence of each character
//      Use the position of the array as the ASCII value for each character in the pattern
        for (int i = 0; i < size; i++) {
            misMatch[str[i]] = i;
        }
    }

    //  The searching algorithm
    public void search() {
        int lengthOfPattern = pattern.length;
        int lengthOfText = text.length;
        int count = 0;


//      Fill the array for the pattern

        int i = 0;  // How many shifts to do for the genome sequence
        while (i <= lengthOfText - lengthOfPattern) {
            int j = lengthOfPattern - 1;

//          Match each character from the end for both sequence and pattern
//          minus index for each correct match
            while (j >= 0 && pattern[j] == text[i + j])
                j--;

//          What happens if its a match

            if (j < 0) {
                count++;
                System.out.printf("index %d match the query sequence\n", i);

              /* Shift the pattern such that the next
                 index in text aligns with the last
                 occurrence of it in pattern.
                 The condition s+m < n is important in
                 the case when pattern occurs at the end
                 of text. This is because pattern might shift
                 ahead of the text which will result in ArrayOutOfBounds exception.
               */

                if (i + lengthOfPattern < lengthOfText) {
                    i += (lengthOfPattern - misMatch[text[i + lengthOfPattern]]);
                } else {
                    i++;
                }

//                s = s + ((s + m < n) ? m - misMatch[text[s + m]] : 1);

            } else{
              /*
                 According to pre processing, shift the pattern to match
                 the text. Max function used so that it returns at least 1
                 and does not shift backwards.*/

                i += Math.max(1, j - misMatch[text[i + j]]);}

        }

        // If there is no occurrence of the pattern
        if (count < 1) {
            System.out.println("No occurrence");
        } else {
            System.out.println("Total number of occurrences : " + count);
        }
    }
}
