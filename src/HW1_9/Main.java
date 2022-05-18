package HW1_9;
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Антуан", "Экзюпери");
        Author author2 = new Author("Джоан", "Роулинг");
        Book book1 = new Book("Маленький принц", author1, 2022);
        Book book2 = new Book("Гарри Поттер и философский камень", author2, 1997);
        Library library = new Library(2);
        library.placeBook(book1).placeBook(book2);
        library.printBooks();
        library.bookInfo("Маленький принц");
        library.setYearPublishing("Маленький принц", 1943);
        library.bookInfo("Маленький принц");
    }
}