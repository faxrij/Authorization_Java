package com.example.delta.forgorPassword;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ForgotPasswordRequest {
    private String username;
    private String password;


}
