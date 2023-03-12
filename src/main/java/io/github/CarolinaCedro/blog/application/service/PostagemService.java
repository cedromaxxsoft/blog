package io.github.CarolinaCedro.blog.application.service;

import io.github.CarolinaCedro.blog.application.model.Postagem;

import java.util.List;
import java.util.Optional;

public interface PostagemService {

    Postagem criarPostagem(Postagem postagem);
    List<Postagem>todasPostagens();
    Optional<Postagem>onePostagem(String id);
    void deletePostagem(String id);

}
