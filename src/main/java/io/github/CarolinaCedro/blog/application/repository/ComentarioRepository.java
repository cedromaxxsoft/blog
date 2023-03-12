package io.github.CarolinaCedro.blog.application.repository;

import io.github.CarolinaCedro.blog.application.model.Comentario;
import io.github.CarolinaCedro.blog.application.model.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepository extends MongoRepository<Comentario,String> {
}
