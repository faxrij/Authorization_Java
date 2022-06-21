package com.example.delta.Service;

import com.example.delta.Repository.UserRepository;
import com.example.delta.UserPack.Data.User;
import com.example.delta.UserPack.Data.User_Role;
import lombok.AllArgsConstructor;

import java.util.List;


public interface UserService {
    User saveUser(User user);
//    User_Role saveRole(User_Role role);
    User getUser(String username);
    List<User> getUsers();


//    @Override
//    public UserDetails loadUserByUsername(String email)
//            throws UsernameNotFoundException {
////        System.out.println("KALXOZZZZ");
//        userRepository.findByEmailAdress(email);
////        return userRepository.findByEmailAdress(email).
////                orElseThrow(()-> new UsernameNotFoundException(String.format(USER_NOT_FOUND_MSG,email)));
//
//    }


//    public String singUpUser(User user){
//        boolean userExists= userRepository.findByEmailAdress(user.getEmailAdress())
//                .isPresent();
//        if(userExists){
//            throw new IllegalStateException("email Already taken");
//        }
//        else{
//            String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
//            user.setPassword(user.getPassword());
//            userRepository.save(user);
//            return "it works";
//
//            // TODO : SEND confirmation token
//        }
//
//    }
}
