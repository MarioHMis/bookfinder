package com.mario.booksearch.bookfinder.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record DataBook(
        String title,
        String authors,
        String languages,
        int birth_year,
        int death_year
        ) {
}
