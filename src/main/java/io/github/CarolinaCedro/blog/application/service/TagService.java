package io.github.CarolinaCedro.blog.application.service;

import io.github.CarolinaCedro.blog.application.model.Tag;

import java.util.List;

public interface TagService {

    Tag criaTag(Tag tag);

    List<Tag> tags();
}
