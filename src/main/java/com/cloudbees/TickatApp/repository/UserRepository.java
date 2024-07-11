package com.cloudbees.TickatApp.repository;

import com.cloudbees.TickatApp.dbmodel.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

