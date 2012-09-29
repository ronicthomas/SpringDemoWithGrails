package com.springdemo.library

class ApplicationFilters {

    def filters = {
        all(controller:'*', action:'*') {
            before = {
                log.info("${params}")
            }

        }
    }
}
