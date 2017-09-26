package com.leanstacks.ws.service;

import com.leanstacks.ws.dtos.AppUserDto;
import com.leanstacks.ws.dtos.EmployeeTypeDto;
import com.leanstacks.ws.dtos.LocationDto;
import com.leanstacks.ws.dtos.UserRequestDto;
import com.leanstacks.ws.exception.ExceptionType;
import com.leanstacks.ws.exception.ServiceException;
import com.leanstacks.ws.model.Account;
import com.leanstacks.ws.model.EmployeeType;
import com.leanstacks.ws.model.User;
import com.leanstacks.ws.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceBean implements  UserService{

    /**
     * The Logger for this Class.
     */
    private static final Logger logger = LoggerFactory.getLogger(UserServiceBean.class);


    @Autowired
    AccountService accountService;

    @Autowired
    UserRepository userRepository;

    @Override
    public AppUserDto findUserByAccountName(String username) throws ServiceException{

        logger.info("> findUserByAccountName");

        Account account = accountService.findByUsername(username);
        if(account == null)
            throw new ServiceException(ExceptionType.UNABLE_TO_LOAD_OBJECT);

        User user = userRepository.FindUserByAccountId(account.getId());
        if(user == null)
            throw new ServiceException(ExceptionType.UNABLE_TO_LOAD_OBJECT);

        logger.info("< findUserByAccountName");

       return  getUserRequestDto(user);



    }


    public AppUserDto getUserRequestDto(User user){
        logger.info("> getUserRequestDto");

        AppUserDto appUserDto = new AppUserDto();

        appUserDto.setUserName(user.getAccount().getUsername());
        appUserDto.setActive(user.getAccount().isExpired()==false ? true:false);
        appUserDto.setEmail(user.getEmail());
        appUserDto.setLastName(user.getLastName());
        appUserDto.setFirstName(user.getFirstName());
        appUserDto.setFunctionalGroup(user.getFunctionGroup());

        LocationDto locationDto = new LocationDto();
        locationDto.setCountry(user.getLocation().getCountry());
        locationDto.setLocation(user.getLocation().getCity());
        locationDto.setRegion(user.getLocation().getRegion());

        appUserDto.setLocationDto(locationDto);

        EmployeeTypeDto employeeTypeDto = new EmployeeTypeDto();

        employeeTypeDto.setName(user.getEmployeeType().getName());
        employeeTypeDto.setType(user.getEmployeeType().getType().getCode());

        appUserDto.setEmployeeType(employeeTypeDto);

        //appUserDto.setEmployeeType(user.getEmployeeType().getType().getCode());

        return appUserDto;

    }
}
