package HW1_9;

public class Library {

    private final Book[] books;

    public Library(int num) {
        books = new Book[num];
    }

    public Library placeBook(Book newBook) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = newBook;
                return this;
            }
        }
        return this;
    }

    public void printBooks() {
        for (Book book : books) {
            if (book != null) {
                System.out.println(book.getAuthorName().authorFirstName() + " " + book.getAuthorName().authorLastName() + " : "
                        + book.getName() + " : " + book.getYearPublishing());
            } else return;
        }
    }
    public void bookInfo(String bookName) {
        for (Book book : books) {
            if (bookName.equals(book.getName())) {
                System.out.println(bookName + " by " + book.getAuthorName().authorFirstName() + " "
                        + book.getAuthorName().authorLastName() + " was published in " + book.getYearPublishing());
                return;
            }
        }
        System.out.println("Книги с названием " + bookName + " в библиотеке нет");
    }

    public void setYearPublishing(String bookName, int yearPublishing) {
        for (Book book : books) {
            if (bookName.equals(book.getName())) {
                book.setYearPublishing(yearPublishing);
                return;
            }
        }
        System.out.println("Книги с названием " + bookName + " в библиотеке нет");
    }
}