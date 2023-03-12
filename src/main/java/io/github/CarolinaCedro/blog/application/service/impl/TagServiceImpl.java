package io.github.CarolinaCedro.blog.application.service.impl;

import io.github.CarolinaCedro.blog.application.model.Postagem;
import io.github.CarolinaCedro.blog.application.model.Tag;
import io.github.CarolinaCedro.blog.application.repository.PostagemRepository;
import io.github.CarolinaCedro.blog.application.repository.TagRepository;
import io.github.CarolinaCedro.blog.application.service.PostagemService;
import io.github.CarolinaCedro.blog.application.service.TagService;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TagServiceImpl implements TagService {

    private final TagRepository repository;

    public TagServiceImpl(TagRepository repository) {
        this.repository = repository;
    }


    @Override
    public Tag criaTag(Tag tag) {
        return repository.save(tag);
    }

    @Override
    public List<Tag> tags() {
        return repository.findAll();
    }
}
