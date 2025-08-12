package wordanalyzer;

import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyAnalyzer {
    public Map<String, Integer> countFrequencies(List<String> words) {
        Map<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
        return wordCounts;
    }

    public List<Map.Entry<String, Integer>> getTopN(Map<String, Integer> wordCounts, int n) {
        return wordCounts.entrySet()
                .stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(n)
                .collect(Collectors.toList());
    }
}
