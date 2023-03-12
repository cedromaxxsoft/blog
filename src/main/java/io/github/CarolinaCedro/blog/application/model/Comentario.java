package io.github.CarolinaCedro.blog.application.model;

import javafx.geometry.Pos;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Data
@Document
public class Comentario implements Serializable {

    @Id
    private String id;

    @DBRef
    private User user;
    private String conteudo;

    @DBRef
    private Postagem postagem;

    private Date comentarioDate;


    public Comentario(String id, User user, String conteudo, Date comentarioDate) {
        this.id = id;
        this.user = user;
        this.conteudo = conteudo;
        this.comentarioDate = comentarioDate;
    }
}
