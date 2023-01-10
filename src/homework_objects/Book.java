package homework_objects;

public class Book {
    private final String nameBook;
    private final Author writer;
    private int yearOfPublication;

    public Book(String nameBook, Author writer, int yearOfPublication) {
        this.nameBook = nameBook;
        this.writer = writer;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getWriter() {
        return this.writer;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

}
