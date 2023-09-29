package com.springsecurity.springsecurityjwtappli.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SigninRequest {
    private String email;
    private String password;
}
