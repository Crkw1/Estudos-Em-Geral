package com.springapi.teste.userdept.Repository;

import com.springapi.teste.userdept.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
