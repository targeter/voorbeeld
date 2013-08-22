package models;


import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;

import javax.annotation.Nullable;
import java.util.List;

public class Book {

    public static final List<Book> LIBRARY = ImmutableList.of(
            new Book("123", "Boek 1", "Auteur 1"),
            new Book("345", "Boek 2", "Auteur 2"),
            new Book("678", "Boek 3", "Auteur 3")
    );

    public static final Function<Book, String> BOOK_TO_ISBN = new Function<Book, String>() {
        @Nullable
        @Override
        public String apply(@Nullable Book book) {
            return Preconditions.checkNotNull(book).isbn;
        }
    };


    public String isbn;
    public String title;
    public String author;

    public Book() {}

    public Book(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format("%s - %s (%s)", author, title, isbn);
    }
}
