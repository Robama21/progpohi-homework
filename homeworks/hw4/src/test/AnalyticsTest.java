import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AnalyticsTest{
    @Before
    public void createTextAnalyticsInstance(){
    }

    @Test
    public void testIfFileContentIsRetrieved(){
        TextAnalytics analytics = new TextAnalytics("C:\\Users\\angry\\OneDrive\\Desktop\\homeworks\\hw4\\text.txt");
        assertNotEquals("", analytics.file_content);
    }

    @Test
    public void testIfWordsAreTurnedLowercase(){
        TextAnalytics analytics = new TextAnalytics("C:\\Users\\angry\\OneDrive\\Desktop\\homeworks\\hw4\\text.txt");
        analytics.file_content = "Durin";
        analytics.split_words_into_pieces();
        analytics.turn_words_to_lowercase();
        assertEquals("durin", analytics.array_of_words[0].toLowerCase());
    }

    @Test
    public void testIfTextIsDividedIntoWords(){
        TextAnalytics analytics = new TextAnalytics("C:\\Users\\angry\\OneDrive\\Desktop\\homeworks\\hw4\\text.txt");
        assertNotEquals(0, analytics.array_of_words.length);
    }

    @Test
    public void testIfWordsArrayIsEmptyWhenFileIsEmpty(){
        TextAnalytics analytics = new TextAnalytics("C:\\Users\\angry\\OneDrive\\Desktop\\homeworks\\hw4\\text.txt");
        analytics.file_content = " ";
        analytics.split_words_into_pieces();
        assertEquals(0, analytics.array_of_words.length);
    }
}