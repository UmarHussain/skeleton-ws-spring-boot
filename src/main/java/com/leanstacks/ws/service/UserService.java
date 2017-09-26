package com.leanstacks.ws.service;

import com.leanstacks.ws.dtos.AppUserDto;
import com.leanstacks.ws.exception.ServiceException;
import com.leanstacks.ws.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    AppUserDto findUserByAccountName(String userName) throws ServiceException;

    AppUserDto getUserRequestDto(User user);

}
