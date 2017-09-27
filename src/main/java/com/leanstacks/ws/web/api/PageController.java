package com.leanstacks.ws.web.api;

import com.leanstacks.ws.dtos.AppUserDto;
import com.leanstacks.ws.service.UserService;
import com.leanstacks.ws.util.IAuthenticationFacade;
import com.leanstacks.ws.util.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
public class PageController {

   @Autowired
   private UserService userService;

    @Autowired
    private IAuthenticationFacade authenticationFacade;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView getIndexPage() {

        //String username = RequestContext.getUsername();

        String username = authenticationFacade.getAuthentication().getName();

        AppUserDto appUserDto = new AppUserDto();

        try {
            appUserDto = userService.findUserByAccountName(username);
            return new ModelAndView("index","appUserDto",appUserDto);
        }catch(Exception e) {
            return new ModelAndView("index", "appUserDto", appUserDto);
        }

    }
}
