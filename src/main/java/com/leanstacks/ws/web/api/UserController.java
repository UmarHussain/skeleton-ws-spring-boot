package com.leanstacks.ws.web.api;

import com.leanstacks.ws.dtos.ResponseDto;
import com.leanstacks.ws.dtos.AppUserDto;
import com.leanstacks.ws.dtos.UserRequestDto;
import com.leanstacks.ws.exception.ServiceException;
import com.leanstacks.ws.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * Web service endpoint to To Get User Information relating EHours
     * JSON.
     *
     * @return A ResponseEntity containing a Collection of Greeting objects.
     */

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/user/authenticate",
            method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ResponseDto> getUserInfo(@RequestBody UserRequestDto userRequestDto) {
        logger.info("> getUserInfo");

        AppUserDto appUserDto  = new AppUserDto();
        ResponseDto<AppUserDto> responseDto = new ResponseDto<>();

        try {
             appUserDto = userService.findUserByAccountName(userRequestDto.getUsername());
            responseDto.setResponse(appUserDto);
            responseDto.setStatus("SUCCESS");
            logger.info("> getUserInfo");
            return new ResponseEntity<>(responseDto, HttpStatus.OK);
        }catch (ServiceException ex){

            appUserDto.setError("User not Found");
            responseDto.setResponse(appUserDto);
            responseDto.setStatus("FAILURE");
            logger.info("> error in  getUserInfo");
            return new ResponseEntity<>(responseDto, HttpStatus.INTERNAL_SERVER_ERROR);
        }




    }

}
