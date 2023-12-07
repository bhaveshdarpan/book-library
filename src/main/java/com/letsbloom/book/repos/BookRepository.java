package com.letsbloom.book.repos;
import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.stereotype.Repository;

import com.letsbloom.book.models.Book;
public interface BookRepository extends MongoRepository<Book, String>{   
}