package com.gangulwar.newsapiscraper.test;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Testing {
    private static final String HindustanTimes = "https://www.hindustantimes.com/";
    private static final String TimesOfIndia = "https://timesofindia.indiatimes.com/";
    private static final String IndianExpressLimited = "https://indianexpress.com/";

    /*public static void main(String[] args) {
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
                //getImageUrl(HindustanTimes + hrefValue.replaceFirst("/", ""));

            }
        } catch (IOException exception) {
            System.out.println("Error!");
            exception.printStackTrace();
        }
    }*/

    /*public static void main(String[] args) {
        try {
            // Fetch the webpage content using Jsoup
            Document document = Jsoup.connect(HindustanTimes).get();

            // Select all elements with class "hdg3" and extract the text
            Elements headlines = document.select("h3.hdg3 a");
            for (Element headline : headlines) {
                String title = headline.text();
                String link = headline.attr("href");

                // Print the extracted title and link
                System.out.println("Headline Url : " + HindustanTimes + link + "\nHeadline : " + title);
            }

            Elements images = document.select("img.lazy");
            for (Element image : images) {
                String imageUrl = image.attr("data-src");

                System.out.println("\nImage Url : " + imageUrl);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    /*public static void main(String[] args) {
        Document document = Jsoup.parse(HindustanTimes);

        // Extract headline, headline link, and image link
        Elements headlines = document.select("h3.hdg3 > a");
        Elements imageLinks = document.select("figure img");

        // Iterate over the elements and print the desired format
        for (int i = 0; i < headlines.size(); i++) {
            Element headlineElement = headlines.get(i);
            Element imageLinkElement = imageLinks.get(i);

            String headline = headlineElement.text();
            String headlineLink = headlineElement.attr("href");
            String imgLink = imageLinkElement.attr("data-src"); // Assuming you want the 'data-src' attribute

            // Print the desired format
            System.out.println("Headline: " + headline);
            System.out.println("Headline Link: " + headlineLink);
            System.out.println("Image Link: " + imgLink);
            System.out.println();
        }
    }*/

    public static void main(String[] args) throws IOException {
        newsFromHindustanTimes();
    }

    private static void newsFromHindustanTimes() {

        try {
            Document doc = Jsoup.connect(HindustanTimes).get();

            Elements divs = doc.select("div.htImpressionTracking");

            for (Element div : divs) {

/*
            String titleCheck = div.select("h2.hdg3 a").text();
            String title = null;

            if (titleCheck != null) {
                title = titleCheck;
            }else {
                continue;
            }

            // String title = titleCheck != null ? titleCheck : continue;
*/

                // Extracting the title
                Element titleElement = div.selectFirst("h2.hdg3 a");

                String title = null;
                if (titleElement != null) {
                    title = titleElement.text();
                } else {
                    continue;
                }

                // Extracting the section
//            String section = div.select("div.actionDiv a[href]").text();

                // Extracting the url
                String url = HindustanTimes + div.select("h2.hdg3 a").attr("href");

                // Extracting the publication time
                Element timeElement = div.select("div.dateTime").first();
                String time = timeElement != null ? timeElement.text().replace("Published on ","") : div.select("div.dateTime").text().replace("Published on ","");

                // Extracting the story description
                String description = div.select("h2.sortDec").text();

                // Extracting the image URL
                String imageUrl = div.select("figure img").attr("src");

                // Extracting the author
                Element authorElement = div.select("div.storyBy small.byLineAuthor a").first();
                String author = authorElement != null ? authorElement.text() : div.select("div.storyBy small.byLineAuthor a").text();


                System.out.println("Title: " + title);
//            System.out.println("Section: " + section);
                System.out.println("Published: " + time);
                System.out.println("Description: " + description);
                System.out.println("Link: " + url);
                System.out.println("Image URL: " + imageUrl);
                System.out.println("Author: " + author);
                System.out.println("-------------------");
            }
        } catch (IOException ioException) {
            System.out.println("Couldn't connect to hindustan times");
        }
    }
}
