public class Book {

    private GenreType genre;

    public Book(GenreType genre) {
        this.genre = genre;
    }

    public GenreType getGenre() {
        return genre;
    }

    public String getDescriptionFromEnum() {
        return this.genre.getDescription();
    }
}
