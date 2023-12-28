package com.gangulwar.newsapiscraper.response;

import com.gangulwar.newsapiscraper.entity.NewsModal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class Response {

    @Getter
    @Setter
    String message;

    @Getter
    @Setter
    List<NewsModal> newsModalList;
}
