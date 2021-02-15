package Boyer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFastaFile {

    String pathname;
    String text;
    String pattern;

    public ReadFastaFile() {

        // Constructor to get char array for both text and pattern

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter directory to genome file : ");
        this.pathname = scanner.nextLine();
        text = readFile(pathname);
        System.out.print("Enter pattern to be searched : ");
        pattern = scanner.nextLine();
    }


    // Returns a string with the genome sequence

    private String readFile(String pathname) {

        // Create a StringBuilder to store genome sequence to process it later

        StringBuilder sb = new StringBuilder();

        try (Scanner sc = new Scanner(new File(pathname))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.charAt(0) != '>') {
                    sb.append(line.toUpperCase());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
