package homework_objects;

import java.util.Objects;

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
        return nameBook;
    }

    public Author getWriter() {
        return writer;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {

        return "Название книги: '" + nameBook + "', " + writer.toString() + ", год публикации книги: " + yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return nameBook.equals(book.nameBook) && writer.equals(book.writer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, writer);
    }
}
