import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int bookCount() {
        return this.collection.size();
    }

    public void borrowBook(Library library) {
       if (library.bookCount() > 0) this.collection.add(library.lendBook());
    }
}
