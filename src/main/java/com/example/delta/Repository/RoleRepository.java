package com.example.delta.Repository;

import com.example.delta.UserPack.Data.User_Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<User_Role,Integer> {
    User_Role findByName(Integer ID);
}
