public class Main {
    public static void main(String[] args) {
        EntitySerializer<MyEntity> jsonSerializer = new JsonEntitySerializer<>();
        EntitySerializer<MyEntity> xmlSerializer = new XmlEntitySerializer<>();

        List<MyEntity> entities = // Initialize your list of entities

        try {
            jsonSerializer.serialize(entities, "entities.json");
            List<MyEntity> deserializedJson = jsonSerializer.deserialize("entities.json");

            xmlSerializer.serialize(entities, "entities.xml");
            List<MyEntity> deserializedXml = xmlSerializer.deserialize("entities.xml");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
