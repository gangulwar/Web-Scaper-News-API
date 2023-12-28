package com.gangulwar.newsapiscraper.service;

import com.gangulwar.newsapiscraper.Scraper.Scraper;
import com.gangulwar.newsapiscraper.entity.NewsModal;
import com.gangulwar.newsapiscraper.response.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class Service {

    private Scraper scraper=new Scraper();

    public ResponseEntity<Response> getHindustanTimesNews() {

        List<NewsModal> list = scraper.newsFromHindustanTimes();
        if (list != null) {
            Response response = new Response("Top Headlines from Hindustan Times", list);
            return new ResponseEntity<>(response, HttpStatus.OK);

        } else {
            return new ResponseEntity<>(new Response("Unable to get news currently", null), HttpStatus.NOT_FOUND);
        }
    }
}