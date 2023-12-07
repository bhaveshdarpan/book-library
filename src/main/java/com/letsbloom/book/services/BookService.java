package com.letsbloom.book.services;

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
}