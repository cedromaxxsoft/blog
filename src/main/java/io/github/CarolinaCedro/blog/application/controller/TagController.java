package io.github.CarolinaCedro.blog.application.controller;

import io.github.CarolinaCedro.blog.application.model.Tag;
import io.github.CarolinaCedro.blog.application.service.impl.PostagemServiceImpl;
import io.github.CarolinaCedro.blog.application.service.impl.TagServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tag")
public class TagController {

    private final TagServiceImpl service;

    public TagController(TagServiceImpl service) {
        this.service = service;
    }

    @PostMapping
    @RequestMapping(method = {RequestMethod.POST}, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Tag>createTag(@RequestBody Tag tag){
        return ResponseEntity.ok(service.criaTag(tag));
    }

}
