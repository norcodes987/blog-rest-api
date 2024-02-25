package com.norcodes.blog.service;

import com.norcodes.blog.payload.LoginDto;
import com.norcodes.blog.payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
