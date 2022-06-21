package com.example.delta.forgorPassword;


import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/forgot_password")
@AllArgsConstructor
public class ForgotPasswordController {

    private ForgotPasswordService forgotPasswordService;

    @PostMapping()
    public String forgotPassword(@RequestBody ForgotPasswordRequest request){
        return forgotPasswordService.forgotPassword(request);

    }


}