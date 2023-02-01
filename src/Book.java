import java.util.Objects;

public class Book {
    private String titleOfTheBook;
    public int yearOfPublication;
    public Author author;

    public Book(String titleOfTheBook, Author author, int yearOfPublication) {
        this.titleOfTheBook = titleOfTheBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitleOfTheBook() {
        return this.titleOfTheBook;
    }

    public int getYearOfPublication() {
        return this.yearOfPublication;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && titleOfTheBook.equals(book.titleOfTheBook) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titleOfTheBook, yearOfPublication, author);
    }

    @Override
    public String toString() {
        return
                "Название книги - " + titleOfTheBook + ", год издания - " + yearOfPublication + ", Автор - " + author;

    }
}

