package io.github.CarolinaCedro.blog.application.controller;

import io.github.CarolinaCedro.blog.application.model.Postagem;
import io.github.CarolinaCedro.blog.application.service.impl.PostagemServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/postagens")
public class PostagemController {

    private final PostagemServiceImpl service;

    public PostagemController(PostagemServiceImpl service) {
        this.service = service;
    }

    @PostMapping
    @RequestMapping(method = {RequestMethod.POST}, produces = {MediaType.APPLICATION_JSON_UTF8_VALUE, MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Postagem>createPost(@RequestBody Postagem postagem){
        return ResponseEntity.ok(service.criarPostagem(postagem));
    }

    @GetMapping
    @RequestMapping(method = {RequestMethod.GET},produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Postagem>>listandoPostagens(){
        return ResponseEntity.ok(service.todasPostagens());
    }
}
