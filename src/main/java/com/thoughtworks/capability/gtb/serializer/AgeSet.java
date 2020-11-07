package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.Objects;

public class AgeSet {
    public static class AgeSerializer extends StdSerializer<Integer> {
        protected AgeSerializer(Class<Integer> age){
            super(age);
        }

        @Override
        public void serialize(Integer value, JsonGenerator gen, SerializerProvider provider) throws IOException {
            gen.writeNumber(Objects.isNull(value) ? 0 : value);
        }


    }
}
