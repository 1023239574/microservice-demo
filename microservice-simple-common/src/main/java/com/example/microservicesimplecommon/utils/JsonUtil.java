package com.example.microservicesimplecommon.utils;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Component;

@Component
public class JsonUtil {

    public static Object parseJson(String jsonString){
        return JSON.parse(jsonString);
    }
}
