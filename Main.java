package wordanalyzer;

import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path to the text file: ");
        String filePath = scanner.nextLine();

        System.out.print("Enter the number of top words to display: ");
        int topN = scanner.nextInt();
        scanner.nextLine();

        try {
            TextFileReader fileReader = new TextFileReader();
            List<String> lines = fileReader.readFile(filePath);

            TextProcessor processor = new TextProcessor();
            List<String> words = processor.processLines(lines);

            WordFrequencyAnalyzer analyzer = new WordFrequencyAnalyzer();
            Map<String, Integer> wordCounts = analyzer.countFrequencies(words);

            List<Map.Entry<String, Integer>> topWords = analyzer.getTopN(wordCounts, topN);

            System.out.println("\nTop " + topN + " most frequent words:");
            for (Map.Entry<String, Integer> entry : topWords) {
                System.out.printf("%-15s : %d%n", entry.getKey(), entry.getValue());
            }

            System.out.println("\nBar Chart:");
            BarChartPrinter.print(topWords);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
