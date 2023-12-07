package com.letsbloom.book.services;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.letsbloom.book.models.Book;
import com.letsbloom.book.repos.BookRepository;

@Service
public class BookService {
    private BookRepository bookRepository;
    public BookService(BookRepository bookRepository) {
        super();
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(String id) {
        return bookRepository.findById(id);
    }

    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    public void updateBook(String id, Book updatedBook) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            Book existingBook = optionalBook.get();
            existingBook.setTitle(updatedBook.getTitle());
            existingBook.setAuthor(updatedBook.getAuthor());
            existingBook.setisbn(updatedBook.getisbn());
            bookRepository.save(existingBook);
        }
    }

    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }

    public void seedDatabaseWithMockData() {
        // Sample mock data
        Book book1 = new Book();
        book1.setTitle("Book Title 1");
        book1.setAuthor("Author 1");
        book1.setisbn("ISBN 1");

        Book book2 = new Book();
        book2.setTitle("Book Title 2");
        book2.setAuthor("Author 2");
        book2.setisbn("ISBN 2");

        // Save mock data to the database
        bookRepository.saveAll(Arrays.asList(book1, book2));
    }
}
