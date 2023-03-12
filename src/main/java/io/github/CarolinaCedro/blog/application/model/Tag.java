package io.github.CarolinaCedro.blog.application.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@Document
public class Tag implements Serializable {

    @Id
    private String id;
    private String nomeTag;

    public Tag() {
    }

    public Tag(String id, String nomeTag) {
        this.id = id;
        this.nomeTag = nomeTag;
    }
}
