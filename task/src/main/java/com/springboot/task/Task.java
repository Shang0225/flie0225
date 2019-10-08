package com.springboot.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class Task {

    @Scheduled(cron = "0/5 * * * * *")
    public void task(){
        System.out.println("aaaa"+new Date());
    }

}
