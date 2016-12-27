package com.example.crypt.converter;

import com.example.crypt.utils.EncryptUtils;
import org.jooq.Converter;

import java.math.BigDecimal;

/**
 * Created by youyifan on 2016/12/27.
 */
public class EncryptedBigDecimalConverter implements Converter<String, BigDecimal> {

    @Override
    public BigDecimal from(String t) {
        return t == null ? null : BigDecimal.valueOf(Double.valueOf(EncryptUtils.decrypt(t)));
    }

    @Override
    public String to(BigDecimal u) {
        return u == null ? null : EncryptUtils.encrypt(u.toString());
    }

    @Override
    public Class<String> fromType() {
        return String.class;
    }

    @Override
    public Class<BigDecimal> toType() {
        return BigDecimal.class;
    }
}
