package com.example.diploma_cloudservice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.diploma_cloudservice.Entity.Users;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, String> {

    Optional<Users> findByLogin(String login);

    void deleteByLogin(String login);

}
