package com.medfusion.medfusion_user_service.repository;

import com.medfusion.medfusion_user_service.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    // Find users where name contains the given parameter (case-insensitive)
    List<User> findByNameContainingIgnoreCase(String name);
}
