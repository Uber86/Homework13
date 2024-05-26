import java.util.Objects;

public class Book {

    // Прошлый урок
    private String nameBook;
    private Author author;
    private int yearIssue;

    public Book (String bookName, Author authorName, int yearIssue) {
        this.nameBook = bookName;
        this.author = authorName;
        this.yearIssue = yearIssue;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }
    public int getYearIssue() {
        return this.yearIssue;
    }
    public void setYearIssue(int yearIssue) {
        this.yearIssue = yearIssue;
    }

    // ДЗ
    public String toString() {
        return "Название книги : " + nameBook +
                ". Автор: " + author +
                ". Издание от : " + yearIssue + " года.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, author);
    }
}
