import java.util.*;

public class BookService {
    private final LinkedList<Book> books;

    public BookService(LinkedList<Book> books) {
        this.books = books;
    }

    public List<Book> searchByTitle(String keyword) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> filterByGenre(String genre) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> getAllBooks() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllBooks'");
    }
}