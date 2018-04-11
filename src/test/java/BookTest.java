import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book1;

    @Before
    public void before() {
        book1 = new Book(GenreType.GRAPHIC_NOVEL);
    }

    @Test
    public void bookHasGenre() {
        assertEquals(GenreType.GRAPHIC_NOVEL, book1.getGenre());
    }

    @Test
    public void canAccessBookGenreDescription() {
        assertEquals("Like comic book, but more serious", book1.getDescriptionFromEnum());
    }
}
