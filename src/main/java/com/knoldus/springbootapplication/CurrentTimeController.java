package com.knoldus.springbootapplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * class CurrentTimeController.
 */
@RestController
public class CurrentTimeController  {
  /**
   * Method called at /status api.
   *
   * @return String
   */
  @GetMapping("/status")
  public String currentTimeMethod() {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter
            .ofPattern("dd/MM/yyyy HH:mm:ss");
    LocalDateTime currentTime = LocalDateTime.now();
    return "Running { " + dateTimeFormatter.format(currentTime) + " }";
  }
}


