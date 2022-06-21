package com.example.delta.forgorPassword;

import com.example.delta.Service.UserServiceImplementation;
import com.example.delta.UserPack.Data.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ForgotPasswordService {
    @Autowired
    private UserServiceImplementation userServiceImplementation;

    public String forgotPassword(ForgotPasswordRequest request){
        log.info(request.getUsername());
        log.info(request.getPassword());
        return userServiceImplementation.forgotPassword(request.getUsername(),request.getPassword());
    }

//    @Autowired
//    private UserServiceImplementation userServiceImplementation;
//
//    @PostMapping()
//    public void processForgotPassword(@RequestBody ForgotPasswordRequest request) throws IOException {
////        Gson gson = new Gson();
////        User c1 = gson.fromJson(request.getReader(), User.class);
////        String email = c1.getUsername();
////        String password = c1.getPassword();
//
//        userServiceImplementation.forgotPassword(email,password);
//
//    }

}
