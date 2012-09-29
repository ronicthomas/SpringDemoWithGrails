package com.springdemo.library

import org.springframework.stereotype.Component

@Component
class AuthorService {

    Author saveAuthorAndAddBooks(Author author) {
        Book.list().each {
            it.addToAuthors(author)
        }

        author.save()
    }
}
