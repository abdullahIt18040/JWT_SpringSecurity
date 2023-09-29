package com.springsecurity.springsecurityjwtappli.repositories;

import com.springsecurity.springsecurityjwtappli.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepos extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);


}
