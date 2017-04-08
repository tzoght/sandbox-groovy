/**
 * MaaS sandbox-groovy
 * Created by tzoght on 2017-04-07.
 */


import ch0.Book
import ch0.FixedBook
import spock.lang.Specification


class BookTest extends Specification {

    def "Test Mutable Book: default constructor "() {

        Book book = new Book();

        when:
        book.setTitle('Lord of the rings')

        then:
        assert book.getTitle() == 'Lord of the rings'
    }

    def "Test Mutable Book: one argument constructor "() {

        Book book

        when:
        book = new Book(title: 'Lord of the rings')

        then:
        assert book.getTitle() == 'Lord of the rings error'
    }

    def "Test Immutable Book"() {

        FixedBook book;

        when:
        book = new FixedBook(title: 'Bible')
        book.setTitle('Empty')

        then:
        Exception ex = thrown()
        assert ex != null
    }

}
