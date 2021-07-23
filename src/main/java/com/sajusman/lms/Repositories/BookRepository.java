package com.sajusman.lms.Repositories;

import com.sajusman.lms.Models.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
    List<Book> findAllByGenreId(Long genreId);
}