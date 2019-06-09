import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TextAnalytics implements AnalyticsInterface{
    String path;
    String text;
    String[] words;
    int wordsCount;
    public TextAnalytics(String path) throws IOException{
        this.path = path;
        this.readFile();
        this.splitText();
        this.wordsToLowercase();
        this.countWordsLongerThanInput();
    }
    @Override
    public void readFile(){
        Path filepath = Paths.get(this.path);
        try{
            byte[] textInBytes = Files.readAllBytes(filepath);
            String text = new String (textInBytes, StandardCharsets.UTF_8);
            this.text = text;
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @Override
    public void splitText(){
        String[] words = this.text.split(" ");
        this.words = words;
    }
    @Override
    public void wordsToLowercase(){
        for(int i = 0; i < this.words.length; i++){
            String word = this.words[i];
            this.words[i] = word.toLowerCase();
        }
    }
    @Override
    public void countWordsLongerThanInput(){
        System.out.print("Search by length: ");
        Scanner inputScanner = new Scanner(System.in);
        int input = inputScanner.nextInt();
        int wordsCount = 0;
        for (int i = 0; i<words.length; i++){
            if(words[i].length() > input){
                wordsCount++;
            }
        }
        this.wordsCount = wordsCount;
    }
}