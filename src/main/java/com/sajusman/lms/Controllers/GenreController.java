package com.sajusman.lms.Controllers;

import com.sajusman.lms.Repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/genre")
public class GenreController {
    @Autowired
    private GenreRepository genreRepository;

    @GetMapping
    public Iterable findAll() {
        return genreRepository.findAll();
    }
}
