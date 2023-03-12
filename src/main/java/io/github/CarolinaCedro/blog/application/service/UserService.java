package io.github.CarolinaCedro.blog.application.service;

import io.github.CarolinaCedro.blog.application.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User>findAll();

    Optional<User>findOne(String id);

    User create (User user);
}
