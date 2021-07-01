package com.sajusman.lms.Repositories;

import com.sajusman.lms.Models.Author;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}