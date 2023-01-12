import homework_objects.Author;
import homework_objects.Book;

public class Main {
    public static void main(String[] args) {
        Author theFirstWriter = new Author("Людмила", "Петрановская");
        Book theFirstBook = new Book("Большая книга про вас и вашего ребенка", theFirstWriter, 2017);

        theFirstBook.setYearOfPublication(2018);
        System.out.println(theFirstBook);

        Author theSecondWriter = new Author("Мария", "Кардакова");
        Book theSecondBook = new Book("Сначала суп, потом десерт", theSecondWriter, 2020);
        System.out.println(theSecondBook);
        System.out.println(theSecondBook.equals(theFirstBook));
        Author theThirdWriter = new Author("Людмила", "Петрановская");
        Book theThirdBook = new Book("Большая книга про вас и вашего ребенка", theThirdWriter, 2022);
        System.out.println(theFirstBook.equals(theThirdBook));
        System.out.println(theFirstWriter.equals(theThirdWriter));
    }
}