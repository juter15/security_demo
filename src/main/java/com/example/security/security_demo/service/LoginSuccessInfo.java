package com.example.security.security_demo.service;

import com.example.security.security_demo.model.User;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class LoginSuccessInfo {
    private long user_seq;
    private String user_name;
    private String user_id;
    private String user_pw;

    public LoginSuccessInfo(User user){
        this.user_seq = user.getUser_seq();
        this.user_name = user.getUser_name();
        this.user_id = user.getUser_id();
        this.user_pw = user.getUser_pw();
    }
}
