import java.io.IOException;

public interface AnalyticsInterface{
    void readFile();
    void splitText();
    void wordsToLowercase();
    void countWordsLongerThanInput() throws IOException;
}