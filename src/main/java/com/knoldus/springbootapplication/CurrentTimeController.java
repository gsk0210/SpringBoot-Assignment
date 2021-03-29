package com.knoldus.springbootapplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * class CurrentTimeController.
 */
@RestController
public class CurrentTimeController {
    /**
     * Object dateTimeFormatter of class DateTimeFormatter
     * Object currentTime of class LocalTime
     */
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter
            .ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime currentTime = LocalDateTime.now();
    @GetMapping("/status")
    public String currentTime() {
        return "Running { " + dateTimeFormatter.format(currentTime) + " }";
    }

}
