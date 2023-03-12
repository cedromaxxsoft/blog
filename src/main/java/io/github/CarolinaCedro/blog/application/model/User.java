package io.github.CarolinaCedro.blog.application.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
public class User implements Serializable {

    @Id
    private String id;
    private String nome;
    private String email;
    private String senha;

    public User() {
    }


    public User(String id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
}
