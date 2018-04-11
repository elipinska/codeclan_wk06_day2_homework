import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower firstBorrower;
    private Library myLibrary;

    @Before
    public void before() {
        firstBorrower = new Borrower("Ewa");
        myLibrary = new Library(150);
        myLibrary.addBook(new Book(GenreType.CRIME));
        myLibrary.addBook(new Book(GenreType.SCIFI));
        myLibrary.addBook(new Book(GenreType.BIOGRAPHY));
    }


    @Test
    public void getName() {
        assertEquals("Ewa", firstBorrower.getName());
    }
    @Test
    public void hasEmptyCollection() {
        assertEquals(0, firstBorrower.bookCount());
    }

    @Test
    public void canBorrowBook() {
        firstBorrower.borrowBook(myLibrary);
        firstBorrower.borrowBook(myLibrary);
        assertEquals(2, firstBorrower.bookCount());
    }

    @Test
    public void cantBorrowMoreThanLibraryStock() {
        firstBorrower.borrowBook(myLibrary);
        firstBorrower.borrowBook(myLibrary);
        firstBorrower.borrowBook(myLibrary);
        firstBorrower.borrowBook(myLibrary);
        firstBorrower.borrowBook(myLibrary);
        firstBorrower.borrowBook(myLibrary);
        firstBorrower.borrowBook(myLibrary);
        assertEquals(3, firstBorrower.bookCount());
    }
}
