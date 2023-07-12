package com.example.diploma_cloudservice.Repo;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.diploma_cloudservice.Entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, String> {
}
