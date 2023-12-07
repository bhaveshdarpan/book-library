package com.letsbloom.book.services;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import com.letsbloom.book.models.Book;
import com.letsbloom.book.repos.BookRepository;

@Service
public class DatabaseSeederService {

    private final BookRepository bookRepository;

    public DatabaseSeederService(BookRepository bookRepository) {
        super();
        this.bookRepository = bookRepository;
    }

    public void seedDatabaseWithRandomBooks(int numberOfBooks) {
        Faker faker = new Faker();

        for (int i = 0; i < numberOfBooks; i++) {
            String title = faker.book().title();
            String author = faker.book().author();
            String isbn = faker.code().isbn13();

            Book book = new Book();
            book.setTitle(title);
            book.setAuthor(author);
            book.setisbn(isbn);

            bookRepository.save(book);
        }
    }
}

