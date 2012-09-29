import com.springdemo.library.Author
import com.springdemo.library.Book
import com.springdemo.library.Library

class BootStrap {

    def init = { servletContext ->
        100.times {
            new Book(name: "Book $it").save(flush: true)
        }
    }
    def destroy = {
    }
}
