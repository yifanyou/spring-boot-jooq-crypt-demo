package com.example.crypt.utils;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/**
 * Created by youyifan on 2016/12/27.
 */
public class EncryptUtils {
    private static final String algorithm = "PBEWithMD5AndTripleDES";
    private static final String password = "test";
    private static StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();

    static {
//        encryptor.setAlgorithm(algorithm);
        encryptor.setPassword(password);
    }

    public static String encrypt(String message) {
        return encryptor.encrypt(message);
    }

    public static String decrypt(String message) {
        return encryptor.decrypt(message);
    }

}
