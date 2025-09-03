package com.kayffeine.timezonebuddy.controller;

import com.kayffeine.timezonebuddy.service.TimeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/time")
public class TimeController {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @GetMapping
    public Map<String, String> getTime(@RequestParam List<String> cities) {
        return timeService.getCurrentTimes(cities);
    }
}
