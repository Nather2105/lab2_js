package serialization.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class JsonEntitySerializer<T> implements EntitySerializer<T> {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void serialize(List<T> entities, String filePath) throws IOException {
        objectMapper.writeValue(Paths.get(filePath).toFile(), entities);
    }

    @Override
    public List<T> deserialize(String filePath) throws IOException {
        return objectMapper.readValue(Paths.get(filePath).toFile(), objectMapper.getTypeFactory().constructCollectionType(List.class, Object.class));
    }
}
