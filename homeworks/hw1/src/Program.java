import java.util.Arrays;

/**
 * Program
 */
public class Program {

    public static void main(String[] args) {
        TextAnalytics text = new TextAnalytics("C:\Users\angry\OneDrive\Desktop\homeworks\hw1\text.txt");
        String array_string = Arrays.toString(text.array_of_words);
        System.out.println(array_string);

    }
}