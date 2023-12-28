package com.gangulwar.newsapiscraper.controller;

import com.gangulwar.newsapiscraper.response.Response;
import com.gangulwar.newsapiscraper.service.Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private Service service=new Service();
    @GetMapping("/hindustanTimes")
    public ResponseEntity<Response> getHindustanTimesNews(){
        return service.getHindustanTimesNews();
    }
}
