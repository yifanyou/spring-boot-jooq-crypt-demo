package com.example.crypt.domain.crypt;

/**
 * Created by youyifan on 2016/12/27.
 */
public class EncryptedString {

    String text;

    public EncryptedString(String text){
        this.text = text;
    }

    public String toString(){
        return text;
    }
}
