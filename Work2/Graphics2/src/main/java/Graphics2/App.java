package Graphics2;

public final class App {

    public static void main(String[] args) {
        DelfiLinkScraper scraper = new DelfiLinkScraper("https://www.delfi.ee/");
        scraper.makeWebRequest();
        scraper.extractLinks();
        //System.out.println(scraper.getHtml());
    }
}
