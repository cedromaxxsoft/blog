package io.github.CarolinaCedro.blog.application.model.jackson.user;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import io.github.CarolinaCedro.blog.application.model.User;

import java.io.IOException;

public class UserSerializer extends JsonSerializer<User> {


    @Override
    public void serialize(User value, JsonGenerator gen, SerializerProvider serializers) throws IOException {

        if (value.getId() == null) {
            gen.writeNullField("id");

        } else {
            gen.writeStartObject();
            gen.writeStringField("id", value.getId());
            gen.writeStringField("nome", value.getNome());
            gen.writeStringField("email", value.getEmail());
            gen.writeStringField("senha", value.getSenha());
            gen.writeEndObject();
        }


    }

}