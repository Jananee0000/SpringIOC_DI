package org.tnsif.springdi;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Library {
	private List<Book> books;

    // Constructor-based dependency injection
    public Library(List<Book> books) {
        this.books = books;
    }

    public void displayBooks() {
        // Sort books by author
    	Comparator<Book> byAuthor = Comparator.comparing(Book::getAuthor);
    	Collections.sort(books, byAuthor);
        //Collections.sort(books, Comparator.comparing(Book::getAuthor));

        System.out.println("Books in the library (sorted by author):");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
