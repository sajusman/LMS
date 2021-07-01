package com.sajusman.lms.Controllers;


import com.sajusman.lms.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/author")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping
    public Iterable findAll() {
        return authorRepository.findAll();
    }

}
