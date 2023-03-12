package io.github.CarolinaCedro.blog.application.service.impl;

import io.github.CarolinaCedro.blog.application.model.Postagem;
import io.github.CarolinaCedro.blog.application.repository.PostagemRepository;
import io.github.CarolinaCedro.blog.application.service.PostagemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostagemServiceImpl implements PostagemService {

    private final PostagemRepository repository;

    public PostagemServiceImpl(PostagemRepository repository) {
        this.repository = repository;
    }

    @Override
    public Postagem criarPostagem(Postagem postagem) {
        return repository.save(postagem);
    }

    @Override
    public List<Postagem> todasPostagens() {
        return repository.findAll();
    }

    @Override
    public Optional<Postagem> onePostagem(String id) {
        return repository.findById(id);
    }

    @Override
    public void deletePostagem(String id) {
        repository.deleteById(id);
    }
}
