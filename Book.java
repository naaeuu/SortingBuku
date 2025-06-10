public class Book {
    private String title;
    private String authors;
    private String genre;
    private String thumbnail;
    private String description;

    public Book(String title, String authors, String genre, String thumbnail, String description) {
        this.title = title;
        this.authors = authors;
        this.genre = genre;
        this.thumbnail = thumbnail;
        this.description = description;
    }

    public String getTitle() { return title; }
    public String getAuthors() { return authors; }
    public String getGenre() { return genre; }
    public String getThumbnail() { return thumbnail; }
    public String getDescription() { return description; }

    @Override
    public String toString() {
        return title + " - " + authors + " [" + genre + "]";
    }
}