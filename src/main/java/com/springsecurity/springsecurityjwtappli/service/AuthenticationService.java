package com.springsecurity.springsecurityjwtappli.service;

import com.springsecurity.springsecurityjwtappli.request.SignUpRequest;
import com.springsecurity.springsecurityjwtappli.request.SigninRequest;
import com.springsecurity.springsecurityjwtappli.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);

    JwtAuthenticationResponse signin(SigninRequest request);
}
