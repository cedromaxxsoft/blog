package io.github.CarolinaCedro.blog.application.model.jackson.user;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import io.github.CarolinaCedro.blog.application.model.User;

import java.io.IOException;

public class UserDeserializer extends JsonDeserializer<User> {

    @Override
    public User deserialize(JsonParser json, DeserializationContext ctxt) throws IOException, JsonProcessingException {
        JsonNode node = json.getCodec().readTree(json);
        String id = node.get("id").asText();
        String nome = node.get("nome").asText();
        String email = node.get("email").asText();
        String senha = node.get("senha").asText();
        return new User(id, nome, email, senha);
    }

}


