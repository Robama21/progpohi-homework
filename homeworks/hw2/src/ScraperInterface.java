import org.jsoup.nodes.Document;
import java.io.IOException;

public interface ScraperInterface{
    void openScraper(String url);
    void openHtml(String url);
    void saveHtml(Document doc) throws IOException;
    void closeScraper();
}