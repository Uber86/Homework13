import java.util.Objects;

public class Author {

    // Прошлый урок
    private String name;
    private String fullName;

    public Author  (String name, String fullName) {
        this.name = name;
        this.fullName = fullName;
    }
    public String getName() {
        return this.name;
    }
    public String getFullName() {
        return this.fullName;
    }
    // ДЗ
    @Override
    public String toString() {
        return name + ' ' + fullName ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(fullName, author.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, fullName);
    }
}
