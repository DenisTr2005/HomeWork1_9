package HW1_9;
public class Book {
    private final String name;
    private final Author authorName;
    private int yearPublishing;
    public Book(String name, Author authorName, int yearPublishing) {
        this.name = name;
        this.authorName = authorName;
        this.yearPublishing = yearPublishing;
    }
    public String getName() {
        return name;
    }
    public Author getAuthorName() {
        return authorName;
    }
    public int getYearPublishing() {
        return yearPublishing;
    }
    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

}
