package Boyer;


import java.util.Scanner;

// Main program outputted to choose file, pattern and which algorithm to search

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            ReadFastaFile fastaFile = new ReadFastaFile();
            System.out.println("Select the following search algorithms. ");
            System.out.println("1: Brute Force Search");
            System.out.println("2: Boyer Moore Search");
            System.out.println("3: Start Search");
            System.out.println("4: Exit");
            choice = scanner.nextInt();

            //Find start time of algorithm
            long start = System.currentTimeMillis();

            switch (choice) {
                case 1:
                    BruteForceSearch bruteForce = new BruteForceSearch(fastaFile.text, fastaFile.pattern);
                    bruteForce.search();
                    break;
                case 2:
                    SearchBoyer searchBoyer = new SearchBoyer(fastaFile.text.toCharArray(), fastaFile.pattern.toCharArray());
                    searchBoyer.search();
                    break;
                case 3:
                    StartSearch startSearch = new StartSearch(fastaFile.text.toCharArray(), fastaFile.pattern.toCharArray());
                    startSearch.search();
                    break;
                default:
                    break;
            }
            // Find end time of algorithm and print out time taken for algorithm in milliseconds
            long end = System.currentTimeMillis();
            System.out.printf("Time taken : %d milliseconds\n", end - start);
        } while (choice < 4);
    }
}
