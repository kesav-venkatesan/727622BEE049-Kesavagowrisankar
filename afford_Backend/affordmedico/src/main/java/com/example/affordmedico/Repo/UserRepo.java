package com.example.affordmedico.Repo;

import com.example.affordmedico.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
