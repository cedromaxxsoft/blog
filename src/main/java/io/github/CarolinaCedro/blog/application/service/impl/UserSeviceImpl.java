package io.github.CarolinaCedro.blog.application.service.impl;

import io.github.CarolinaCedro.blog.application.model.User;
import io.github.CarolinaCedro.blog.application.repository.UserRepository;
import io.github.CarolinaCedro.blog.application.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserSeviceImpl implements UserService {

    private final UserRepository repository;

    public UserSeviceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<User> findOne(String id) {
        return repository.findById(id);
    }

    @Override
    public User create(User user) {
        return repository.save(user);
    }
}
