package io.github.CarolinaCedro.blog.application.repository;

import io.github.CarolinaCedro.blog.application.model.Postagem;
import io.github.CarolinaCedro.blog.application.model.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends MongoRepository<Tag,String> {
}
