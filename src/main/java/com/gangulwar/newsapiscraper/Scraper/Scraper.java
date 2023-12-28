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
    private static final String IndianExpressLimited = "https://indianexpress.com/";


    public List<NewsModal> newsFromHindustanTimes() {

        List<NewsModal> newsModalList = new ArrayList<>();

        try {
            Document doc = Jsoup.connect(HindustanTimes).get();

            Elements divs = doc.select("div.htImpressionTracking");

            for (Element div : divs) {

                NewsModal newsModal = new NewsModal();

                // Extracting the title
                Element titleElement = div.selectFirst("h2.hdg3 a");

                String title = null;
                if (titleElement != null) {
                    title = titleElement.text();
                    newsModal.setTitle(title);
                } else {
                    continue;
                }

                // Extracting the url
                String url = HindustanTimes + div.select("h2.hdg3 a").attr("href");
                newsModal.setUrl(url);

                // Extracting the publication time
                Element timeElement = div.select("div.dateTime").first();
                String time = timeElement != null ? timeElement.text().replace("Published on ", "") : div.select("div.dateTime").text().replace("Published on ", "");
                newsModal.setPublishedOn(time);

                // Extracting the story description
                String description = div.select("h2.sortDec").text();
                newsModal.setDescription(description);

                // Extracting the image URL
                String imageUrl = div.select("figure img").attr("src");
                newsModal.setImageUrl(imageUrl);

                // Extracting the author
                Element authorElement = div.select("div.storyBy small.byLineAuthor a").first();
                String author = authorElement != null ? authorElement.text() : div.select("div.storyBy small.byLineAuthor a").text();
                newsModal.setAuthor(author);

                newsModalList.add(newsModal);
            }


        } catch (IOException ioException) {
            System.out.println("Couldn't connect to hindustan times");
        }

        return newsModalList;
    }
}