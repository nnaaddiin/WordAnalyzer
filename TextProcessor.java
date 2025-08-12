package wordanalyzer;

import java.util.*;
import java.util.stream.Collectors;
public class TextProcessor {
    public List<String> processLines(List<String> lines) {
        return lines.stream()
                .flatMap(line -> Arrays.stream(line.toLowerCase().split("\\W+")))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toList());
    }
}
