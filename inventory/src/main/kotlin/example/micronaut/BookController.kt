package example.micronaut

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/api") 
class BooksController {

    @Produces(MediaType.TEXT_PLAIN) 
    @Get("/inventory/{isbn}") 
    fun inventory(isbn: String): HttpResponse<Int> {
        return when (isbn) { 
            "1491950358" -> HttpResponse.ok(25)
            "1680502395" -> HttpResponse.ok(33)
            else -> HttpResponse.notFound()
        }
    }
}

