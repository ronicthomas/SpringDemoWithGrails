package com.springdemo.library

import org.springframework.stereotype.Component

@Component
class MyLogger {

    void info(String message) {
        println("INFO ${message}")
    }

    void error(String message) {
        println("ERROR ${message}")
    }

    void debug(String message) {
        println("DEBUG ${message}")
    }

    void warn(String message) {
        println("WARN ${message}")
    }

}
