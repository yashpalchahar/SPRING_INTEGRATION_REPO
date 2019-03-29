package com.chahar.cucumber.helper;

import java.util.HashMap;
import java.util.Map;

public class DataHelper {
    private static Map<String,String> paramValues = new HashMap<>();

    public static void put(final String key,final String value){
        paramValues.put(generateInternalKey(key),value);
    }
    public static String get(final String key){
        return paramValues.get(generateInternalKey(key));
    }

    private static String generateInternalKey(final String key){
        return Thread.currentThread().getName()+"_"+key;
    }
}
