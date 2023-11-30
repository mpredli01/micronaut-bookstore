package example.micronaut

import groovy.transform.CompileStatic
import javax.inject.Singleton

@CompileStatic
@Singleton
class BooksRepositoryImpl implements BooksRepository {

    @Override
    List<Book> findAll() {
            [
            new Book("1491950358", "Java for Dummies"),
            new Book("1680502395", "Effective Java"),
            ]
        }
    }
