package com.example.crypt.converter;

import com.example.crypt.utils.EncryptUtils;
import org.jooq.Converter;

/**
 * Created by youyifan on 2016/12/27.
 */
public class EncryptedStringConverter implements Converter<String, String> {

    @Override
    public String from(String t) {
        return t == null ? null:EncryptUtils.decrypt(t);
    }

    @Override
    public String to(String u) {
        return u == null ? null:EncryptUtils.encrypt(u);
    }

    @Override
    public Class<String> fromType() {
        return String.class;
    }

    @Override
    public Class<String> toType() {
        return String.class;
    }
}
