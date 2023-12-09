package com.gangulwar.newsapiscraper.Scraper;

import com.gangulwar.newsapiscraper.entity.NewsModal;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Scraper {

    private static final String HindustanTimes = "https://www.hindustantimes.com/";
    private static final String TimesOfIndia = "https://timesofindia.indiatimes.com/";
    //    Indian Express Limited
    private static final String IndianExpressLimited = "https://indianexpress.com/";

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        int count = 0;
        //while (true) {
        //System.out.println("Enter url of product:");
        //String url = scanner.next();
        try {
            Document document = Jsoup.connect(HindustanTimes).get();
            System.out.println("Title :" + document.title());
            Elements aElement = document.select("h3.hdg3 a");

            for (Element h3Element : aElement) {
                count++;
                String textContent = h3Element.text().trim();
                System.out.println(count + ":" + textContent);

                String hrefValue = h3Element.attr("href");
//                System.out.println("href attribute value: " + HindustanTimes + hrefValue.replaceFirst("/", ""));
//                System.out.println("---");
                getImageUrl(HindustanTimes + hrefValue.replaceFirst("/", ""));

            }
        } catch (IOException exception) {
            System.out.println("Error!");
            exception.printStackTrace();
        }


    }

    public static List<String> getLatestNews() throws Exception {
        ArrayList<String> lists = new ArrayList<>();
        Document hindustanTimes = Jsoup.connect(HindustanTimes).get();
        Elements aElement = hindustanTimes.select("h3.hdg3 a");

        for (Element h3Element : aElement) {
            //count++;
            NewsModal newsModal = new NewsModal();
            String textContent = h3Element.text().trim();
//            System.out.println(count + ":" + textContent);
            newsModal.setTitle(textContent);
            String hrefValue = h3Element.attr("href");
//            System.out.println("href attribute value: " + HindustanTimes + hrefValue.replaceFirst("/", ""));
//            System.out.println("---");

        }
        return null;
    }

    private static String getImageUrl(String url) {

        try {
            Document document = Jsoup.parse(url);

            // Select the 'img' element inside the 'picture' element
            Element imgElement = document.select("div.storyParagraphFigure picture img").first();

            // Get the value of the 'src' attribute (URL of the image)
            String imageUrl = imgElement.attr("src");

            System.out.println("URL of the image: " + imageUrl);

            return imageUrl;
        } catch (Exception e) {
            System.out.println("IOException");
        }

        return null;
    }


}
