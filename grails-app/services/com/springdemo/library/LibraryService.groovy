package com.springdemo.library

import org.springframework.stereotype.Component

@Component
class LibraryService {

    Library saveLibraryAndAddBooks(Library library) {
        Book.all.each {Book book ->
            library.addToBooks(book)
        }

        library.save()
    }
}
