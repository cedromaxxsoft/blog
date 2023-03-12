package io.github.CarolinaCedro.blog.application.repository;

import io.github.CarolinaCedro.blog.application.model.Postagem;
import io.github.CarolinaCedro.blog.application.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends MongoRepository<Postagem,String> {
}
