package io.github.CarolinaCedro.blog.application.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.github.CarolinaCedro.blog.application.model.jackson.tag.user.TagDeserializer;
import io.github.CarolinaCedro.blog.application.model.jackson.tag.user.TagSerializer;
import io.github.CarolinaCedro.blog.application.model.jackson.user.UserSerializer;
import io.github.CarolinaCedro.blog.application.model.jackson.user.UserDeserializer;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

@Data
@Document
public class Postagem implements Serializable {

    @Id
    private String id;


    @DBRef
    @JsonSerialize(using = UserSerializer.class)
    @JsonDeserialize(using = UserDeserializer.class)
    private User user;

    private String titulo;
    private String descricao;

    @DBRef
    @JsonSerialize(using = TagSerializer.class)
    @JsonDeserialize(using = TagDeserializer.class)
    private Tag tag;



    public Postagem() {
    }

    public Postagem(String id, User user, String titulo, String descricao, Tag tag) {
        this.id = id;
        this.user = user;
        this.titulo = titulo;
        this.descricao = descricao;
        this.tag = tag;
    }
}
