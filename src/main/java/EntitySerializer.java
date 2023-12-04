import java.io.IOException;
import java.util.List;

public interface EntitySerializer<T> {
    void serialize(List<T> entities, String filePath) throws IOException;
    List<T> deserialize(String filePath) throws IOException;
}
