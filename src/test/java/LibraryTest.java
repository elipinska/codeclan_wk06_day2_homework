import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library myLibrary;

    @Before
    public void before() {
        myLibrary = new Library(5);
    }


    @Test
    public void hasNoBooks() {
        assertEquals(0, myLibrary.bookCount());
    }

    @Test
    public void addBooksHasThree() {
        myLibrary.addBook(new Book(GenreType.BIOGRAPHY));
        myLibrary.addBook(new Book(GenreType.YOUNG_ADULT));
        myLibrary.addBook(new Book(GenreType.CRIME));
        assertEquals(3, myLibrary.bookCount());
    }

    @Test
    public void stockNotFull() {
        assertEquals(false, myLibrary.stockFull());
    }

    @Test
    public void stockFull() {
        myLibrary.addBook(new Book(GenreType.GRAPHIC_NOVEL));
        myLibrary.addBook(new Book(GenreType.SCIFI));
        myLibrary.addBook(new Book(GenreType.BIOGRAPHY));
        myLibrary.addBook(new Book(GenreType.YOUNG_ADULT));
        myLibrary.addBook(new Book(GenreType.CRIME));
        assertEquals(5, myLibrary.bookCount());
        assertEquals(true, myLibrary.stockFull());
    }

    @Test
    public void tooManyBooks() {
        myLibrary.addBook(new Book(GenreType.GRAPHIC_NOVEL));
        myLibrary.addBook(new Book(GenreType.SCIFI));
        myLibrary.addBook(new Book(GenreType.BIOGRAPHY));
        myLibrary.addBook(new Book(GenreType.YOUNG_ADULT));
        myLibrary.addBook(new Book(GenreType.CRIME));
        myLibrary.addBook(new Book(GenreType.GRAPHIC_NOVEL));
        myLibrary.addBook(new Book(GenreType.SCIFI));
        myLibrary.addBook(new Book(GenreType.BIOGRAPHY));
        myLibrary.addBook(new Book(GenreType.YOUNG_ADULT));
        myLibrary.addBook(new Book(GenreType.CRIME));
        myLibrary.addBook(new Book(GenreType.GRAPHIC_NOVEL));
        myLibrary.addBook(new Book(GenreType.SCIFI));
        myLibrary.addBook(new Book(GenreType.BIOGRAPHY));
        myLibrary.addBook(new Book(GenreType.YOUNG_ADULT));
        myLibrary.addBook(new Book(GenreType.CRIME));
        assertEquals(5, myLibrary.bookCount());
        assertEquals(true, myLibrary.stockFull());
    }

    @Test
    public void canLendBook() {

        Book book1 = new Book(GenreType.GRAPHIC_NOVEL);
        myLibrary.addBook(book1);
        myLibrary.addBook(new Book(GenreType.SCIFI));
        myLibrary.addBook(new Book(GenreType.BIOGRAPHY));
        myLibrary.addBook(new Book(GenreType.YOUNG_ADULT));
        myLibrary.addBook(new Book(GenreType.CRIME));
        assertEquals(5, myLibrary.bookCount());
        myLibrary.lendBook();
        assertEquals(4, myLibrary.bookCount());
    }

    @Test
    public void booksByGenreHasGenres() {
        myLibrary.addBook(new Book(GenreType.GRAPHIC_NOVEL));


        myLibrary.addBook(new Book(GenreType.SCIFI));
        myLibrary.addBook(new Book(GenreType.SCIFI));
        myLibrary.addBook(new Book(GenreType.BIOGRAPHY));
        myLibrary.addBook(new Book(GenreType.YOUNG_ADULT));
        myLibrary.addBook(new Book(GenreType.CRIME));
        assertEquals(5, myLibrary.bookCount());
        assertEquals(0, myLibrary.getBooksByGenre());
    }
}