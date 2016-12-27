package com.example.crypt.converter;

import org.jooq.Converter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 * Created by youyifan on 2016/12/27.
 */
public class LocalDateTimeConverter implements Converter<Timestamp, LocalDateTime> {
    @Override
    public LocalDateTime from(Timestamp t) {
        return t == null ? null : LocalDateTime.parse(t.toString());
    }

    @Override
    public Timestamp to(LocalDateTime u) {
        return u == null ? null : Timestamp.valueOf(u.toString());
    }

    @Override
    public Class<Timestamp> fromType() {
        return Timestamp.class;
    }

    @Override
    public Class<LocalDateTime> toType() {
        return LocalDateTime.class;
    }
}
