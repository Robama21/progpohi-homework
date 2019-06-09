import java.io.IOException;
import java.util.Arrays;

public class Program{
    public static void main(String[] args) throws IOException{
        TextAnalytics analytics = new TextAnalytics("C:\\Users\\angry\\OneDrive\\Desktop\\homeworks\\hw3\\text.txt");
        String text = Arrays.toString(analytics.words);
        System.out.println(text);
        String wordsCount = Integer.toString(analytics.wordsCount);
        System.out.println(wordsCount);
    }
}