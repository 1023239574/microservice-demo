package com.example.microservicesimpleapi.bean.requset;

import lombok.Data;

@Data
public class LoginParams {
    private String username;

    private String password;
}
