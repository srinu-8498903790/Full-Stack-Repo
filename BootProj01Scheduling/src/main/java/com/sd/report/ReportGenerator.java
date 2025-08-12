package com.sd.report;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("report")
public class ReportGenerator
{
    @Scheduled( fixedDelay = 0000)
    public void generatesSalesReport()
    {
        System.out.println("SalesReport on ::" + newDate());
    }
    
    @Scheduled( fixedDelay = 0000)
    public void SalesReport()
    {
        System.out.println("SalesReport on ::" + newDate());
    }

    private String newDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return now.format(formatter);
    }
}
