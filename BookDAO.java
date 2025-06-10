import java.io.*;
import java.util.LinkedList;

public class BookDAO {

    public static LinkedList<Book> loadBooksFromJSON(String filePath) throws IOException {
        LinkedList<Book> books = new LinkedList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder jsonContent = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                jsonContent.append(line.trim());
            }

            parseJSONArray(jsonContent.toString(), books);
        }

        return books;
    }

    private static void parseJSONArray(String json, LinkedList<Book> books) {
        int start = json.indexOf("[");
        int end = json.lastIndexOf("]");

        if (start == -1 || end == -1) return;

        String jsonArray = json.substring(start + 1, end).trim();

        String[] jsonObjects = jsonArray.split("\\},\\{");

        for (int i = 0; i < jsonObjects.length; i++) {
            if (i > 0) jsonObjects[i] = "{" + jsonObjects[i];
            if (i < jsonObjects.length - 1) jsonObjects[i] += "}";
            parseJSONObject(jsonObjects[i], books);
        }
    }

    private static void parseJSONObject(String jsonObject, LinkedList<Book> books) {
        String title = extractValue(jsonObject, "Title");
        String authors = extractValue(jsonObject, "Authors");
        String genre = extractValue(jsonObject, "Genre");
        String thumbnail = extractValue(jsonObject, "Thumbnail");
        String description = extractValue(jsonObject, "Description");

        books.add(new Book(title, authors, genre, thumbnail, description));
    }

    private static String extractValue(String json, String key) {
        String keyPattern = "\"" + key + "\":";
        int startIndex = json.indexOf(keyPattern);

        if (startIndex == -1) return "";

        int valueStart = json.indexOf("\"", startIndex + keyPattern.length());
        int valueEnd = json.indexOf("\"", valueStart + 1);

        if (valueStart == -1 || valueEnd == -1) return "";

        return json.substring(valueStart + 1, valueEnd);
    }
}