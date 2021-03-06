package com.leanstacks.ws.configuration.security;

import com.google.gson.GsonBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Spring Security success handler, specialized for Ajax requests.
 */
@Component
public class RestAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {


    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication)
            throws ServletException, IOException {



       // request.geth
       // response.setContentType("application/json;charset=UTF-8");
        response.setContentType( "text/html utf-8" );
        response.sendRedirect("/index");
        //PrintWriter writer = response.getWriter();
        //writer.write(new GsonBuilder().create().toJson(authentication));
        response.setStatus(HttpServletResponse.SC_OK);
        //writer.flush();
        //writer.close();
    }
}
