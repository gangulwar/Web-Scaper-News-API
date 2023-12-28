# Web Scaper News API

## Overview
API for retrieving news from various sources through web scraping techniques.

Implemented using [Jsoup](https://jsoup.org/)

## Endpoints
### News from Hindustan Times's [homepage](https://www.hindustantimes.com/)

```
GET /hindustanTimes
```

### Sample Output
```
{
    "message": "Top Headlines from Hindustan Times",
    "newsModalList": [
        {
            "title": "Minister slams report claiming Centre urged Apple to soften impact of hack alert",
            "publishedOn": "Dec 28, 2023 11:42 PM IST",
            "description": "In October, several Opposition politicians received alerts that state-backed hackers might have hacked their mobile phones. At a meeting of local leaders in Telangana, union home minister Amit Shah said BRS was a sunken ship and the Congress was a sinking ship. In a release, the government said the body has issued \"compliance Show Cause Notices to nine offshore Virtual Digital Assets Service Providers (VDA SPs)\". Judi Weinstein Haggai and her husband, both Israeli Americans, were taken hostage from their community of Kibbutz Nir. South Africa hammered India by an innings and 32 runs in the series opener at the Supersport Park in Centurion inside three days. PM Modi will inaugurate several projects in the state and launch new Amrit Bharat and Vande Bharat trains ahead of the consecration ceremony at the Ram temple. NYC prepares for Times Square New Year's Eve Ball Drop amid concerns of potential disruptions by Pro-Palestine protestors amid Israel-Hamas conflict. Prashanth Neel’s Prabhas, Prithviraj Sukumaran and Shruti Haasan-starrer has been going great guns at the box office.",
            "url": "https://www.hindustantimes.com//india-news/minister-slams-report-claiming-centre-urged-apple-to-soften-impact-of-iphone-hacking-alerts-101703786710129.html",
            "imageUrl": "https://www.hindustantimes.com/ht-img/img/2023/12/28/550x309/Minister-of-state-for-Electronics-and-Information-_1703786984662_1703786994236.jpg",
            "author": "HT News Desk"
        },
        {
            "title": "Akshay Kumar responds to Shikhar Dhawan's emotional post on son's birthday",
            "publishedOn": "Dec 28, 2023 09:27 PM IST",
            "description": "Shikhar Dhawan and his ex-wife Ayesha Mukherjee parted ways in October. Now Akshay Kumar has extended his support to Shikhar. Anupam Kher folded his hands while talking to the Union Defence Minister. For the meeting, Anupam wore a black jacket, denims and shoes. Rohit Sharma had no shame in admitting that India were outplayed after they lost the first Test to South Africa by an innings and 32 runs. Irfan Pathan said sorry to keep Sunil Gavaskar waiting but The Little Master was having none of it. There's a twist involved. As Covid-19 variant, JN.1 infection reaches Delhi, expert reveals 10 ways to safeguard your health amid ongoing viral evolution",
            "url": "https://www.hindustantimes.com//entertainment/bollywood/akshay-kumar-responds-to-shikhar-dhawan-emotional-post-on-son-zoravar-birthday-101703777656880.html",
            "imageUrl": "https://images.hindustantimes.com/default/550x309.jpg",
            "author": "HT Entertainment Desk"
        },
        {
            "title": "Plan your Long Weekends in 2024 now with this itinerary",
            "publishedOn": "Updated on Dec 28, 2023 09:54 PM IST",
            "description": "Here’s a quick guide to where to go and what to do within India. And the visa-free international destinations that you can add to your long weekend itinerary. Don’t pick the ordinary on New Year’s Eve. Whether you're keeping it small or going all-out, bring in 2024 in style. Here are the top 10 places in the world. While hybrid work model provides flexibility and a work-life-balance, it can change marital life dynamics in unexpected ways. New Year is almost here. If you have made some resolutions, check out these seven practical ways to stick to them in New Year 2024. The year 2023 was truly the year of millets as people included the ancient superfoods in their meals with great enthusiasm.",
            "url": "https://www.hindustantimes.com//lifestyle/travel/plan-your-long-weekends-in-2024-now-with-this-itinerary-101702015763568.html",
            "imageUrl": "https://images.hindustantimes.com/default/550x309.jpg",
            "author": "Preeti Verma Lal"
        }
    ]
}

```
