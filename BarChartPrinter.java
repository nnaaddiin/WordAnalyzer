package wordanalyzer;

import java.util.List;
import java.util.Map;

public class BarChartPrinter {
    public static void print(List<Map.Entry<String, Integer>> wordList) {
        for (Map.Entry<String, Integer> entry : wordList) {
            System.out.printf("%-15s | %s%n", entry.getKey(), "*".repeat(entry.getValue()));
        }
    }
}
