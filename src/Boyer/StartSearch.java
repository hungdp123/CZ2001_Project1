package Boyer;


public class StartSearch {
    char[] text;
    char[] pattern;
    int count = 0;

    public StartSearch(char[] text, char[] pattern) {
        this.text = text;
        this.pattern = pattern;
    }

    public void search() {
        int lengthOfText = text.length;
        int lengthOfPattern = pattern.length;

        //we want to skip to the next possible starting index while we are brute forcing

        int s = 0; //this will be counter of current index
        //when we find a possible start while brute forcing, update s
        //int myTemp=0; //this will store index
        //int counter=0;
        while (s < lengthOfText - lengthOfPattern + 1) {
            int thisTemp = s;
            int counter = 0;
            if (text[s] == pattern[0]) { // brute force here
                for (int i = 0; i < lengthOfPattern; i++) {
                    if (text[s + i] == pattern[0]) {
                        if (thisTemp == s) {
                            thisTemp = s + i;
                        }
                        //else continue; //do nothing if myTemp is updated already
                    }
                    if (text[s + i] == pattern[i]) {
                        counter += 1;
                    } else {
                        break;
                    }
                }
            }

            if (counter == lengthOfPattern) {
                System.out.printf("index %d match the query sequence\n", s);
                count++;
                s += 1;
            } else {
                if (thisTemp == s) {
                    s++;
                } else {
                    s = thisTemp;
                }
            }
        }
        if (count < 1) {
            System.out.println("No occurrence");
        } else {
            System.out.println("Total number of occurrences : " + count);
        }
    }
}
