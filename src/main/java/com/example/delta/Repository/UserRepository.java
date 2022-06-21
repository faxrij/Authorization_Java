package com.example.delta.Repository;

import com.example.delta.UserPack.Data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByEmailAdress(String emailAdress);


}
