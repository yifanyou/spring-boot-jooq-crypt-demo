package com.example.crypt.converter;

import org.jooq.Converter;

import java.sql.Timestamp;

/**
 * Created by youyifan on 2016/12/27.
 */
public class TimestampStringConverter implements Converter<Timestamp, String> {
    @Override
    public String from(Timestamp t) {
        return t == null ? null : t.toString();
    }

    @Override
    public Timestamp to(String u) {
        return u == null ? null : Timestamp.valueOf(u);
    }

    @Override
    public Class<Timestamp> fromType() {
        return Timestamp.class;
    }

    @Override
    public Class<String> toType() {
        return String.class;
    }
}
