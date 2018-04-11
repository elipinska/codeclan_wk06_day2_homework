import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;
    private HashMap<GenreType, Integer> booksByGenre;

    public Library(int capacity) {
        this.collection = new ArrayList<>();
        this.capacity = capacity;
        this.booksByGenre = new HashMap<>();

        updateStock();
        }

    public void updateStock() {

        booksByGenre.clear();

        for (Book book:collection) {

            GenreType genre = book.getGenre();

           if (!booksByGenre.containsKey(genre)) {
               booksByGenre.put(genre, 0);
           }
            booksByGenre.put(genre, booksByGenre.get(genre) + 1);
        }

    }

    public int bookCount() {
        return collection.size();
    }

    public void addBook(Book newBook) {

        if (!stockFull()) {
            collection.add(newBook);
            updateStock();
        }
    }

    public boolean stockFull() {
        return bookCount() >= capacity;
    }

    public Book lendBook() {

        return this.collection.remove(0);
    }

    public HashMap getBooksByGenre() {
        return booksByGenre;
    }
}
