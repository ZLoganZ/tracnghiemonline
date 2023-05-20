package com.loganz.tracnghiemonline.repositories;

import com.loganz.tracnghiemonline.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByEmail(String email);

    @Query(value = "{'email': ?0}")
    Optional<User> getUser(String email);

}
