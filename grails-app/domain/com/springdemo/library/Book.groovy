package com.springdemo.library

class Book {
    String name

    static  hasMany = [authors: Author]

    static constraints = {
    }
}
