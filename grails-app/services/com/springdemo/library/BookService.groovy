package com.springdemo.library

import org.springframework.stereotype.Component
import grails.plugin.springcache.annotations.Cacheable

@Component
class BookService {

    Book saveBookAndAddAuthors(Book book) {
        Author.list().each {
            book.addToAuthors(it)
        }

        book.save()

    }

    @Cacheable("bookCache")
    List listBooks(params) {
        println "In cached folder"
        return Book.list(params)
    }
}
