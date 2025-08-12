package wordanalyzer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextFileReader {
    public List<String> readFile(String filePath) throws IOException {
        return Files.readAllLines(Paths.get(filePath));
    }
}
