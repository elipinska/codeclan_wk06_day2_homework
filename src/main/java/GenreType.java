public enum GenreType {
    SCIFI("Works exploring imaginative concepts such as advanced science and technology"),
    BIOGRAPHY("Books about real people (usually)"),
    CRIME("Books usually centeres around an investigation"),
    YOUNG_ADULT("Books for 12-18-year-olds"),
    GRAPHIC_NOVEL("Like comic book, but more serious");

    private final String description;

    GenreType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
