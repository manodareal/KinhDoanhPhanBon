package com.example.usermanagement.domain.repo;

import com.example.usermanagement.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findUserByEmail(String email);
}
