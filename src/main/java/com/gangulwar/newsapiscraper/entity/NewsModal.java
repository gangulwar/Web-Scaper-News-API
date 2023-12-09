package com.gangulwar.newsapiscraper.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class NewsModal {

    @Getter
    @Setter
    String title;

    @Getter
    @Setter
    String imageUrl;

    @Getter
    @Setter
    String source;
}
