package com.springdemo.library

import org.springframework.stereotype.Component

@Component
class BookService {

    Book saveBookAndAddAuthors(Book book) {
        Author.list().each {
            book.addToAuthors(it)
        }

        book.save()

    }
}
