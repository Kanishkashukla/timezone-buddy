package com.kayffeine.timezonebuddy.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
public class TimeService {

    private static final String API_URL = "https://timeapi.io/api/Time/current/zone?timeZone=";

    public Map<String, String> getCurrentTimes(List<String> cities) {
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> results = new LinkedHashMap<>();

        for (String city : cities) {
            try {
                String timezone = resolveTimezone(city);
                String endpoint = API_URL + timezone;

                Map response = restTemplate.getForObject(endpoint, Map.class);

                if (response != null && response.containsKey("dateTime")) {
                    results.put(city, response.get("dateTime").toString());
                } else {
                    results.put(city, "No data");
                }
            } catch (Exception e) {
                results.put(city, "Error fetching time");
            }
        }
        return results;
    }

    private String resolveTimezone(String city) {
        switch (city.toLowerCase()) {
            case "tokyo": return "Asia/Tokyo";
            case "new_york": return "America/New_York";
            case "london": return "Europe/London";
            case "delhi": return "Asia/Kolkata";
            case "sydney": return "Australia/Sydney";
            default: return "Etc/UTC"; // fallback
        }
    }
}
