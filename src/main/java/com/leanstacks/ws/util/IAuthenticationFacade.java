package com.leanstacks.ws.util;


import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;


public interface IAuthenticationFacade {
    Authentication getAuthentication();
}
