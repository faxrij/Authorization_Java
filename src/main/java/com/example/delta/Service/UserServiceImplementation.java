package com.example.delta.Service;

import com.example.delta.Repository.RoleRepository;
import com.example.delta.Repository.UserRepository;
import com.example.delta.UserPack.Data.User;
import com.example.delta.UserPack.Data.User_Role;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImplementation implements UserService, UserDetailsService {
    @Autowired
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByEmailAdress(username);
        if(user==null){
            log.info("user not found in database");
            throw new UsernameNotFoundException("user not found in database");
        }
        else{
            log.info(username,"found in database");

        }
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("Admin"));
        return new org.springframework.security.core.userdetails.User(user.getEmailAdress(),user.getPassword(),authorities);
    }

    @Override
    public User saveUser(User user) {
        log.info("Saving new user");
        user.setPassword(passwordEncoder.encode (user.getPassword()));
        return userRepository.save(user);
    }

//    @Override
//    public User_Role saveRole(User_Role role) {
//        log.info("Saving new role");
//
//        return roleRepository.save(role);
//    }

    public String forgotPassword(String email,String password){
        User foundUser =  userRepository.findByEmailAdress(email);
        if(foundUser!=null){
            foundUser.setPassword(passwordEncoder.encode(password));
            userRepository.save(foundUser);
            return "New password set";
        }
        else{
            return "User not found";
        }
    }

    public String signUp(User user){

        if (userRepository.findByEmailAdress(user.getEmailAdress())!=null){
            throw new IllegalStateException("email already taken");
        }
        else{
            String encodedPassword = passwordEncoder.encode(user.getPassword());
            user.setPassword(encodedPassword);
            userRepository.save(user);
        }
        return "it works";
    }

    @Override
    public User getUser(String username) {
        return userRepository.findByEmailAdress(username) ;
    }

    @Override
    public List<User> getUsers() {

        return userRepository.findAll();
    }

}
