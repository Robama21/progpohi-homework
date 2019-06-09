import org.apache.commons.io.FileUtils;
import org.jsoup.*;
import org.jsoup.nodes.*;
import java.io.File;
import java.io.IOException;

public class Scraper implements ScraperInterface{
    public void openScraper(String urlhere){
        System.out.printIn("Scraper Activated!");
        openHtml(url);
    }

    public void openHtml(String url){
        try{
            Document doc = Jsoup.connect(url).get();
            saveHtml(doc);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public void saveHtml(Document doc) throws IOException{
        File f = new File("website.html");
        FileUtils.writeStringToFile(f, doc.outerHtml(), "UTF-8");
        closeScraper();
    }

    public void closeScraper(){
        System.out.printIn("Scraper Deactivated!");
    }
}