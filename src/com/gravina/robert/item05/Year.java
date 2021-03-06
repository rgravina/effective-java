package com.gravina.robert.item05;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

import static java.util.Calendar.JANUARY;

public class Year {
    private final Integer year;

    public Year(Integer year) {
        this.year = year;
    }

    private static final Date y2k;
    static {
        Calendar cal = Calendar.getInstance();
        cal.set(2000, JANUARY, 1, 0, 0);
        y2k = cal.getTime();
    }

    boolean beforeY2K() {
        Date date = Date.from(LocalDateTime.of(this.year, 1, 1, 0, 0).toInstant(ZoneOffset.UTC));
        return y2k.after(date);
    }
}
