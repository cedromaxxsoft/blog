package io.github.CarolinaCedro.blog.application.model.jackson.tag.user;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import io.github.CarolinaCedro.blog.application.model.Tag;
import io.github.CarolinaCedro.blog.application.model.User;

import java.io.IOException;

public class TagDeserializer extends JsonDeserializer<Tag> {

    @Override
    public Tag deserialize(JsonParser json, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = json.getCodec().readTree(json);
        String id = node.get("id").asText();
        String nome = node.get("nomeTag").asText();
        return new Tag(id, nome);
    }
}


