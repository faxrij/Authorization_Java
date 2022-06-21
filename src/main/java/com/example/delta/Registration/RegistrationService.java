package com.example.delta.Registration;

import com.example.delta.Service.UserServiceImplementation;
import com.example.delta.UserPack.Data.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Slf4j

@Service
public class RegistrationService {
    @Autowired
    private UserServiceImplementation userServiceImplementation;
    public String register(RegistrationRequest request){
        log.info(request.getUsername());
        log.info(request.getLastName());
        return userServiceImplementation.signUp(new User(
                1,1,request.getUsername(),request.getLastName(),
                request.getEmail(),request.getPassword(),1));
    }
}
