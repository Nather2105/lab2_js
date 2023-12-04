package serialization.xml;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.List;

public class XmlEntitySerializer<T> implements EntitySerializer<T> {
    @Override
    public void serialize(List<T> entities, String filePath) throws JAXBException {
        // Implementation for XML serialization
    }

    @Override
    public List<T> deserialize(String filePath) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(List.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (List<T>) unmarshaller.unmarshal(new File(filePath));
    }
}
