package com.springdemo.library

class Library {
    String name
    String address
    static hasMany = [books: Book]

    static constraints = {
    }
}
