package com.knoldus.springbootapplication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@SpringBootTest
class AssignmentSpringbootApplicationTest {

    @Test
    void main() {
        CurrentTimeController currentTimeController=new CurrentTimeController();
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime localDateTime=LocalDateTime.now();
        String time="Running { "+dateTimeFormatter.format(localDateTime)+" }";
        Assertions.assertEquals(time,currentTimeController.currentTime());
    }
}