package com.example.crypt.converter;

import org.jooq.Converter;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by youyifan on 2016/12/27.
 */
public class DateStringConverter implements Converter<Date, String> {
    @Override
    public String from(Date t) {
        return t == null ? null : t.toString();
    }

    @Override
    public Date to(String u) {
        return u == null ? null : Date.valueOf(LocalDate.parse(u, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    }

    @Override
    public Class<Date> fromType() {
        return Date.class;
    }

    @Override
    public Class<String> toType() {
        return String.class;
    }
}
