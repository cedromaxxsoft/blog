package io.github.CarolinaCedro.blog.application.repository;

import io.github.CarolinaCedro.blog.application.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User,String> {
}
