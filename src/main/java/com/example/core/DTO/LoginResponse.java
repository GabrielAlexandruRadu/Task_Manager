package com.example.core.DTO;

public class LoginResponse {

    public String token;

    public LoginResponse(String token) {
        this.token = token;
    }
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }


}
