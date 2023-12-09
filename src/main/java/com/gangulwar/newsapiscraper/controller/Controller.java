package com.gangulwar.newsapiscraper.controller;

import com.gangulwar.newsapiscraper.response.Response;
import com.gangulwar.newsapiscraper.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/get")
public class Controller {

    private Service service;
    @GetMapping("/{country}")
    public List<Response> getLatestNews(@PathVariable String country){
        return service.getNewsByCountry(country);
    }
}
