import java.util.Objects;

public class Book {

     private String name;
     private String autor;
     private String gen;

    public Book(String name, String autor, String gen) {
        this.name = name;
        this.autor = autor;
        this.gen = gen;
    }

    public String getName() {
        return name;
    }

    public String getAutor() {
        return autor;
    }

    public String getGen() {
        return gen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals (name, book.name) &&
                Objects.equals (autor, book.autor) &&
                Objects.equals (gen, book.gen);
    }

    @Override
    public int hashCode() {
        return Objects.hash (name, autor, gen);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", autor='" + autor + '\'' +
                ", gen='" + gen + '\'' +
                '}';
    }
}
