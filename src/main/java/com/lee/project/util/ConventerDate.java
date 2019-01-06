package com.lee.project.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class ConventerDate {

    private ConventerDate() {
    }

    public static String longToTimeString(Long time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime conventTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault());
        return conventTime.format(formatter);
    }

    public static String DateTimeToString(LocalDateTime time) {
       return null;
    }


}
