import homework_objects.Author;
import homework_objects.Book;

public class Main {
    public static void main(String[] args) {
        Author theFirstWriter = new Author("Людмила", "Петрановская");
        Book theFirstBook = new Book("Большая книга про вас и вашего ребенка", theFirstWriter, 2017);

        // для проверки корректности выводим на экран
        System.out.println("Год публикации первой книги: " + theFirstBook.getYearOfPublication());
        theFirstBook.setYearOfPublication(2018);
        // для проверки корректности выводим на экран
        System.out.println("Год публикации первой книги: " + theFirstBook.getYearOfPublication());
        System.out.println("Название первой книги: " + theFirstBook.getNameBook());
        System.out.println("Автор первой книги: " + theFirstBook.getWriter().showYourName());

        Author theSecondWriter = new Author("Мария", "Кардакова");
        Book theSecondBook = new Book("Сначала суп, потом десерт", theSecondWriter, 2020);
        // для проверки корректности выводим на экран
        System.out.println("Год публикации второй книги: " + theSecondBook.getYearOfPublication());
        System.out.println("Название второй книги: " + theSecondBook.getNameBook());
        System.out.println("Автор второй книги: " + theSecondBook.getWriter().showYourName());
    }
}