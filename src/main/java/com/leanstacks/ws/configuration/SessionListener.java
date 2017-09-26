package com.leanstacks.ws.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

//@Configuration
public class SessionListener /*implements HttpSessionListener*/ {
    /*private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RestTemplate restTemplate;

    @Value("/logout")
    private String logoutUrl;



    @Autowired
    HttpSession session;
    @Override
    public void sessionCreated(HttpSessionEvent event) {
        logger.info("==== Session is created ====");
        // Following will set inactive time interval to 1 min
        // event.getSession().setMaxInactiveInterval(1*60);

        // Following will set inactive time interval to infinite time
        event.getSession().setMaxInactiveInterval(0);
    }
 
    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("authorization", "Bearer " + session.getAttribute("accessToken"));

        HttpEntity entity = new HttpEntity(headers);

        logger.info("==== Session is destroyed ====");
    }*/
}