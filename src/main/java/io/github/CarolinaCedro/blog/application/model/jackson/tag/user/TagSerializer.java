package io.github.CarolinaCedro.blog.application.model.jackson.tag.user;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import io.github.CarolinaCedro.blog.application.model.Tag;

import java.io.IOException;

public class TagSerializer extends JsonSerializer<Tag> {

    @Override
    public void serialize(Tag value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeStartObject();
        gen.writeStringField("id", value.getId());
        gen.writeStringField("nomeTag", value.getNomeTag());
        gen.writeEndObject();
    }

}